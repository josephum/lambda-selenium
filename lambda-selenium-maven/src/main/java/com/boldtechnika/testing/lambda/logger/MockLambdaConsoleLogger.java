package com.boldtechnika.testing.lambda.logger;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class MockLambdaConsoleLogger implements LambdaLogger {

    @Override
    public void log(String string) {
        System.out.println(string);
    }
}
