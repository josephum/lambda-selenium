package com.boldtechnika.testing.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

public interface LambdaSeleniumService {
    @LambdaFunction(functionName = "lambda-selenium-function")
    TestResult runTest(TestRequest testRequest);
}
