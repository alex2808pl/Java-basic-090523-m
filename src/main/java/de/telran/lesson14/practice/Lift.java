package de.telran.lesson14.practice;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        int h, n, m;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите этажность дома h = ");
            h = scanner.nextInt();
            System.out.print("Введите шаг подьема лифта n = ");
            n = scanner.nextInt();
            System.out.print("Введите шаг спуска лифта m = ");
            m = scanner.nextInt();
            if(m >= n) System.out.println("Введите корректное значение n>m");
        }
        while (m >= n);

        int currentFloor = 0;
        int i = 0;
        while(currentFloor < h) {
            System.out.println(i+" Teкущий этаж - "+currentFloor);
            currentFloor = numberOfLift(currentFloor, n, m);
            i++;
        }
        System.out.println("Мы достигли последнего этажа "+h+" за количество иттераций - "+i);
    }

    static int numberOfLift(int floor, int stepUp, int stepDown) {
        return floor + stepUp - stepDown;
    }
}
