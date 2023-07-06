package de.telran.lesson12;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        int currentTime, start1, end1, start2, end2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Старт работы 1-го магазина = ");
        start1 = scanner.nextInt(24);
        System.out.print("Окончание работы 1-го магазина = ");
        end1 = scanner.nextInt(24);
        System.out.print("\nСтарт работы 2-го магазина = ");
        start2 = scanner.nextInt(24);
        System.out.print("Окончание работы 2-го магазина = ");
        end2 = scanner.nextInt(24);

        System.out.print("\nВведите текущее время = ");
        currentTime = scanner.nextInt(24);

        //проверяем работают ли магазины
        workingShop1(start1, end1, currentTime);
        workingShop2(start2, end2, currentTime);

    }

    //реализация с if - else
    static void workingShop1(int start, int end, int currentTime) {
        String outMessage;
        if (currentTime >= start && currentTime <= end)
            outMessage = "Магазин1 работает";
        else outMessage = "Магазин1 не работает";
        System.out.println(outMessage);
    }

    //реализация с тернарным оператором
    static void workingShop2(int start, int end, int currentTime) {
        String outMessage = (currentTime >= start && currentTime <= end) ? "Магазин2 работает" : "Магазин2 не работает";
        System.out.println(outMessage);
    }
}
