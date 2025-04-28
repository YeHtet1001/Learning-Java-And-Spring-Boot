package org.example;

public class TwoStringClass {

    public static void twoStringMethod( String a, String b ) {

        System.out.println( a );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println( b );
    }

}
