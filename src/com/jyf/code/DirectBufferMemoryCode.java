package com.jyf.code;

import sun.misc.VM;

import java.nio.ByteBuffer;

public class DirectBufferMemoryCode {
    /*
    * Direct buffer memory
    * */

    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory:"+ (VM.maxDirectMemory()/(double)1024/1024)+"MB");
        //-XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        //Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
        ByteBuffer bb = ByteBuffer.allocateDirect(8*1024*1024);
    }
}
