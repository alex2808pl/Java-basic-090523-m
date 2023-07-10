package de.telran.lesson13;

import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        printWord(5);

        printNumberWithCount(5634, 4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число = ");
        printNumber(scanner.nextInt());

    }

    static void printNumber(int number) { //345
        for(;;) { //вечный цикл, аналог for(int i = 0; i >= 0; i++)
            System.out.println(number % 10);
            number = number / 10;
            if(number==0) break;
        }
    }

    static void printNumberWithCount(int number, int count) { //345
        for(int i = 0; i < count; i++) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }

    static void printWord(int count) {
        int i;
        for(i=0; i < count; i++) { //5 < 5 ложь, выходим из цикла
            System.out.println("Hello World! "+i);
            if(i==3) break;
        }
        System.out.println("i = "+i);
    }
}
