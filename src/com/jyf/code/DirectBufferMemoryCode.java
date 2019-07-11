package com.jyf.code;

import sun.misc.VM;

import java.nio.ByteBuffer;

public class DirectBufferMemoryCode {
    /*
    * Direct buffer memory
    * */
    
    /**
    我是lyy,这是我对你代码的修改
    */

    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory:"+ (VM.maxDirectMemory()/(double)1024/1024)+"MB");
        //-XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        //Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
        ByteBuffer bb = ByteBuffer.allocateDirect(8*1024*1024);
    }
}
