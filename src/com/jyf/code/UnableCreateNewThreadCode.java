package com.jyf.code;

public class UnableCreateNewThreadCode {
    public static void main(String[] args) {

        for (int i = 0;  ; i++) {
            System.out.println("***************"+i);
            new Thread(()->{
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
    }
}
