package org.example;
public class Main {
    public static void main(String[] args) {

        TwoStringClass obj = new TwoStringClass();
        MyThreadClass thread1 = new MyThreadClass( "Hi" , "Brother" ,obj);
        MyThreadClass thread2 = new MyThreadClass( "Hello" , "Tester" ,obj);
        MyThreadClass thread3 = new MyThreadClass( "Konnichiwa" , "Developer",obj );
        
    }
}