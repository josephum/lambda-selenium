package com.blackboard.testing.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;


public class GenerateTests {
	
	public static void main(String[] args) {
		String text = "package com.blackboard.testing.tests;\n" + 
				"import static com.codeborne.selenide.Selenide.open;\n" + 
				"import static com.codeborne.selenide.Selenide.title;\n" + 
				"import static org.hamcrest.CoreMatchers.containsString;\n" + 
				"import static org.junit.Assert.assertThat;\n" + 
				"\n" + 
				"import com.blackboard.testing.common.LambdaBaseTest;\n" + 
				"import com.codeborne.selenide.WebDriverRunner;\n" + 
				"\r\n" + 
				"import org.junit.Test;\n" + 
				"import org.junit.experimental.categories.Category;\n" + 
				"import org.openqa.selenium.WebDriver;\n" + 
				"\n" + 
				"@Category(Test.class)\n" + 
				"public class LambdaTest2 extends LambdaBaseTest {\n" + 
				"\n";
//		int index1 = template.indexOf("@Test");
//		int index2 = template.indexOf("}");
		
//		String templateTest = template.substring(index1, index2+1);
		
		String templateTest = "    @Test\r\n" + 
				"    public void testName() {\r\n" + 
				"        open(\"testURL\");\r\n" + 
				"        screenshot(\"testName\"+\"-home-page\");\r\n" + 
				"    }";
		
//		String text = template.replaceAll(templateTest, "");
		
//		public static Map<String,String> getExcelData(String filePath, String sheetName, List<String> colNames)
		
	    // Parse the Excel file
		String filePath = "./src/test/java/com/blackboard/testing/tests/webs.xlsx";
		String sheetName = "Sheet1";  // Form ID
		List<String> colNames = new ArrayList<>();
		colNames.add("Name"); // key in map
		colNames.add("URL"); // value in map
		Map <String,String> inputFields = getExcelData(filePath, sheetName, colNames);
		
		
		String stOut = text;
		
		for (Map.Entry<String, String> entry : inputFields.entrySet()) {
			String newTest = templateTest.replaceAll("testName", entry.getKey()).
					replaceAll("testURL", entry.getValue());
			stOut = stOut + newTest + "\n";
		}
		
		String stOut2 = stOut + "\n}";
		writeOutputStream(stOut2, "./src/test/java/com/blackboard/testing/tests/LambdaTest2.java");
	}
	
	public static String loadInputStream(String filePath) {
		FileInputStream is = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			is = new FileInputStream(filePath);
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println("Loaded data at: "+filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("The file cannot be loaded at "+filePath);
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	// For saving the XML string into a file
	public static void writeOutputStream(String data, String filePath) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(filePath));
            os.write(data.getBytes(), 0, data.length());
            System.out.println("Saved data at: "+filePath);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("The file cannot be saved at "+filePath);
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	public static Map<String,String> getExcelData(String filePath, String sheetName, List<String> colNames) {
		// List of col. indexes
		List<Integer> colIndexes = new ArrayList<>();
		
		// connects to a file
		FileInputStream fileInputStream = null;
		// create actual excel file
		XSSFWorkbook workBook = null;
		try {
			fileInputStream = new FileInputStream(filePath);
			workBook = new XSSFWorkbook(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create worksheet object
		XSSFSheet sheet = workBook.getSheet(sheetName);
		// number of rows
		int numberOfRows = sheet.getLastRowNum()+1;
		// get number of columns
		int numberOfColunms = sheet.getRow(0).getLastCellNum();

		// Get the column numbers from the labels in row 0 (header row)
		for (int i = 0; i < colNames.size(); i++) {
			// Get the header of the column from the list of header names list
			String colName = colNames.get(i);

			// Get the column numbers from the labels in row 0 (header row)
			for (int j = 0; j < numberOfColunms; j++) {
				// read data using the index
				// save the data in the corresponding index of the array
				XSSFCell cell = sheet.getRow(0).getCell(j);
				// Dataformatter to put integer and others into String as it looks in Excel
				DataFormatter df = new DataFormatter();
				String asItLooksInExcel = df.formatCellValue(cell);
				//			array[i][j] = asItLooksInExcel;
				if (asItLooksInExcel.contentEquals(colName)) {
					colIndexes.add(j);
				}

			}	
		
		}
		
		// Create a 2D array
		String[][] array = new String[numberOfRows-1][colIndexes.size()];
		
		// Start in row 1, after headers row, (numberOfRows-1) rows
		for (int i = 0; i < numberOfRows-1; i++) {
			for (int j = 0; j < colIndexes.size(); j++) {
				// read data using the index
				// save the data in the corresponding index of the array
				XSSFCell cell = sheet.getRow(i+1).getCell(colIndexes.get(j));
				// Dataformatter to put integer and others into String as it looks in Excel
				DataFormatter df = new DataFormatter();
				String asItLooksInExcel = df.formatCellValue(cell);
				array[i][j] = asItLooksInExcel;
			}
		}
		
	    // Print the array from Excel
//		for (int i = 0; i < array.length; i++) {
//			System.out.print("Row: "+i);
//			for (int j = 0; j < array[i].length; j++) {
//				// read data using the index
//			}	
//			System.out.println(Arrays.toString(array[i]));
//		}
		
		// Move Array into Map
		Map<String,String> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i][0], array[i][1]);
		} 

		close(fileInputStream);
		return map;
	}
	
	private static void close(FileInputStream fileInputStream) {
		try {
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
