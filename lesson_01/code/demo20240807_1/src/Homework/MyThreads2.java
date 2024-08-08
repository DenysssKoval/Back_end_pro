package Homework;

public class MyThreads2 implements Runnable{


    @Override
    public void run() {
        System.out.println("Все числа которые делятся на 3");
        for (int i = 100; i < 200; i++) {
            if (i % 3 == 0){
                System.out.println("Multiple of 3: " + i);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("Расчет чисел кратных 3 окончен");

    }


}
