package Homework;
/*Реализовать 2 потока:
первый поток должен выводить на экран все числа, которые делятся на 2;
второй поток должен выводить все числа которые делятся на 3;
Main должен запускать оба эти потока, засыпать на 3 секунды и завершать выполнение программы (т.е. оба потока тоже должны прекратить свою работу)
*/

public class Main {
    public static void main(String[] args) {

        MyThreads evenNumbers = new MyThreads(777, 999);
        Thread multipleOf3 = new Thread(new MyThreads2());

        evenNumbers.setDaemon(true);
        multipleOf3.setDaemon(true);

        evenNumbers.start();
        multipleOf3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        System.out.println(evenNumbers);
        System.out.println(multipleOf3);

    }
}
