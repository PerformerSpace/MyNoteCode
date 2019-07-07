package com.jyf.code;

public class JavaHeapSpaceMemoryError {
    public static void main(String[] args) {
        //-Xms8m -Xmx8m
        byte[] bytes = new byte[1024*1024*20];//20m
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
