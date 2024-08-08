package Homework;

public class MyThreads extends Thread{
    private int first;
    private int last;

    public MyThreads(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public void run() {
        System.out.println("Все числа, которые делятся на 2");

        for (int i = first; i < last; i++) {

            if (i % 2 == 0) {
                System.out.println("even numbers: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        System.out.println("Расчет четных чисел окончен");
    }
}
