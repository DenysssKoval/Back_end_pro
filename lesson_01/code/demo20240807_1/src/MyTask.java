public class MyTask implements Runnable{


    @Override
    public void run() {
        System.out.println("Start Thread 2" );
        for (int i = 1000; i < 1010; i++) {
            System.out.println("My Thread 2: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End Thread 2" );
    }
}
