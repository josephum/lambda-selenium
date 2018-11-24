package com.boldtechnika.testing.tests;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.boldtechnika.testing.common.LambdaBaseTest;

@Category(Test.class)
public class LambdaTest extends LambdaBaseTest {

    @Test
    public void googleTest() {
        open("http://www.google.com/");
        screenshot("google-home-page");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void blackboardTest() {
        open("http://www.blackboard.com/");
        screenshot("blackboard-home-page");
        assertThat(title(), containsString("Blackboard"));
    }
}
