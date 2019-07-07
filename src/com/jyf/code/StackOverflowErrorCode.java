package com.jyf.code;

public class StackOverflowErrorCode {
    public static void main(String[] args) {
        stackOverflowErrorCode();
    }

    private static void stackOverflowErrorCode() {
        stackOverflowErrorCode();//Exception in thread "main" java.lang.StackOverflowError
    }
}
