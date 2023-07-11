package de.telran.lesson14;

public class TestWhileAndFor {
    public static void main(String[] args) {
        runHelloFor();
        System.out.println("");
        runHelloWhile();
        System.out.println("");
        runHelloWhileTrue();
    }

    static void runHelloFor() {
        for(int count=10; count>0; count--)
            System.out.println("Привет программист - "+count);
    }

    static void runHelloWhile() {
        int count = 10;
        while (count > 0) {
            System.out.println("Привет программист - "+count);
            count--;
        }
    }

    static void runHelloWhileTrue() {
        int count = 10;
        while (true) {  //вечный цикл
            System.out.println("Привет программист - "+count);
            count--;
            if(count<1) break; //необходимое условие выхода
        }
    }
}
