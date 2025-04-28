public class MyClass extends Thread {

    public MyClass( String name ) {

        super( name ) ;
        start();

    }

    public void run() {

        for (int i = 0; i < 5 ; i++) {

            System.out.println( i + "::" + this.getName() );

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }

        }

    }

}
