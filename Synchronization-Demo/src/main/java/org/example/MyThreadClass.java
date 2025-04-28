package org.example;

public class MyThreadClass extends Thread {

    private String a;
    private String b;
    private TwoStringClass twoStringClass ;
    public MyThreadClass(String a , String b , TwoStringClass twoStringClass) {

        this.a = a;
        this.b = b;
        this.twoStringClass = twoStringClass;
        start();

    }

    @Override
    public void run() {

        /**
         * It isn't synchronized .
         */
//        TwoStringClass obj = new TwoStringClass();
//        obj.twoStringMethod( a , b );

        synchronized( twoStringClass ) {
            twoStringClass.twoStringMethod(a,b);
        }

    }
}
