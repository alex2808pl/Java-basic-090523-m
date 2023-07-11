package de.telran.lesson14;

public class TestDoWhile {
    public static void main(String[] args) {
//        runHelloWhile();
//        System.out.println();
//        runHelloDoWhile();

        sum();
    }

    static void runHelloWhile() {
        int count = 10;
        while (count > 10) {
            System.out.println("Привет программист (while) - "+count);
            count--;
        }
    }

    static void runHelloDoWhile() {
        int count = 10;
        do {
            System.out.println("Привет программист (do while) - " + count);
            count--;
        } while (count > 10);
    }

    static void sum() {
        int x = 10;
        int sum = 0;
        do {
            sum += x;
            x--;
        } while (x > 10); //10+9+8+...+1
        System.out.println("Сумма = "+sum);
    }
}
