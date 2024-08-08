package Homework;

public class Main {
    public static void main(String[] args) {

        MyThreads evenNumbers = new MyThreads(777, 999);
        //MyThreads2 multipleOf3 = new MyThreads2();

        evenNumbers.start();
        //multipleOf3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            evenNumbers.join();
            //multipleOf3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(evenNumbers);
        //System.out.println(multipleOf3);

    }
}
