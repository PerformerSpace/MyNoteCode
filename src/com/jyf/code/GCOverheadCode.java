package com.jyf.code;

import java.util.ArrayList;
import java.util.List;

/*
*超过98%的时间用来做GC,并且回收了不到2%的堆内存
* */

public class GCOverheadCode {
    //-Xms10m -Xmx10m -XX:MaxDirectMemorySize=5m -XX:+PrintGCDetails
    //java.lang.OutOfMemoryError: GC overhead limit exceeded
    public static void main(String[] args) {
        int i = 0;
        List list = new ArrayList<>();

        try{
            while (true){
                list.add(String.valueOf(++i).intern());
            }

        }catch (Throwable e){
            System.out.println(i);
            e.printStackTrace();
            throw e;
        }
    }
}
