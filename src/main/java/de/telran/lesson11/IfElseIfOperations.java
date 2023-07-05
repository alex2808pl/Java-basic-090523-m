package de.telran.lesson11;

import java.util.Random;

public class IfElseIfOperations {
    public static void main(String[] args) {
        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        System.out.println("Наше сгенерированное число = "+number);

        // простой if
        if(number>0 && number<2) System.out.println("Начался небольщой дождик");
        if(number>=2 && number<5) System.out.println("Сильный дождик");
        if(number>=5 && number<7) System.out.println("На улице ливень!");
        if (number>=7)  System.out.println("Потоп! Сидите дома!");

        // альтернатива
        if(number<2) System.out.println("Начался небольщой дождик");
        else
            if(number<5) System.out.println("Сильный дождик");
            else
                if(number<7) System.out.println("На улице ливень!");
                else System.out.println("Потоп! Сидите дома!");

        // альтернатива
        if (number < 2) {
            System.out.println("Начался небольщой дождик");
        } else if (number < 5) {
            System.out.println("Сильный дождик");
        } else if (number < 7) {
            System.out.println("На улице ливень!");
        } else {
            System.out.println("Потоп! Сидите дома!");
        }

        // работа со строкой
        isDarkOrLight("желтый");

        // пример использования if с булевой переменной
        boolean bVal = true;
        if(bVal) System.out.println("Истина");
    }

    static void isDarkOrLight(String color) {
        if (color.equalsIgnoreCase("белый") || color.equalsIgnoreCase("желтый")) {
            System.out.println(color + " - светлый");
        } else if (color.equalsIgnoreCase("черный")) {
            System.out.println(color + " - темный");
        } else if (color.equalsIgnoreCase("зеленый")) {
            System.out.println(color + " - светлый");
        } else if (color.equalsIgnoreCase("коричневый")) {
            System.out.println(color + " - темный");
        } else {
            System.out.println(color + " - не можем определить");
        }
    }

}
