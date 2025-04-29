public class Main {
    public static void main(String[] args) {

        MyClass thread1 = new MyClass( "Thread 1");
        MyClass thread2 = new MyClass( "Thread 2");

        System.out.println( "Thread1 :: " + thread1.isAlive() );
        System.out.println( "Thread2 :: " + thread2.isAlive() );

        try {

            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }

        System.out.println( "Thread1 :: " + thread1.isAlive() );
        System.out.println( "Thread2x` :: " + thread2.isAlive() );

    }
}