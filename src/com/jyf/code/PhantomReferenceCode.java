package com.jyf.code;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/*
* 虚引用demo
* */
public class PhantomReferenceCode {
    public static void main(String[] args) {
        Object o1 = new Object();
        ReferenceQueue<Object> objectReferenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> objectPhantomReference = new PhantomReference<>(o1, objectReferenceQueue);
        System.out.println(o1);//unnull
        System.out.println(objectReferenceQueue.poll());//null
        System.out.println(objectPhantomReference.get());//null

        System.out.println("==========================================");
        o1 = null;
        System.gc();
        System.out.println(o1);//null
        System.out.println(objectReferenceQueue.poll());//unnull
        System.out.println(objectPhantomReference.get());//null
    }
}
