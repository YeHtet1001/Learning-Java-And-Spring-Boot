package org.example;

public class MyThreadClass extends Thread {

    private String a;
    private String b;

    public MyThreadClass(String a , String b) {

        this.a = a;
        this.b = b;
        start();

    }

    @Override
    public void run() {

        TwoStringClass.twoStringMethod( a , b );

    }
}
