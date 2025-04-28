public class Main {
    public static void main(String[] args) {

        MyClass thread1 = new MyClass( "Thread 1");
        MyClass thread2 = new MyClass( "Thread 2");

        System.out.println( thread1.isAlive() );
        System.out.println( thread2.isAlive() );

        try {

            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }


    }
}