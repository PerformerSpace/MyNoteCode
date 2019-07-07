package com.jyf.code;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceCode {
    public static void main(String[] args) {
        Object o1 = new Object();
        ReferenceQueue<Object> objectReferenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(o1,objectReferenceQueue);

        System.out.println(o1);//unnull
        System.out.println(objectReferenceQueue.poll());//null
        System.out.println(weakReference.get());//unnull
        System.out.println("========================================");
        o1 = null;
        System.gc();
        System.out.println(o1);//null
        System.out.println(objectReferenceQueue.poll());//unnull ,回收前需要被引用队列保存
        System.out.println(weakReference.get());//null



    }
}
