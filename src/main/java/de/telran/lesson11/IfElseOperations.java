package de.telran.lesson11;

import java.util.Random;

public class IfElseOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200) - 100; //интервал от -100 .. +100
        System.out.println("Число сгенерированное = " + number);

        if (number > 0) {
            System.out.println("Температура в Целсиях " + (number - 273));
        } else {
            System.out.println("Мы не можем преобразовать число в температуру в Цельсиях");
        }

        //альтернатива
        if (number > 0) {
            System.out.println("Температура в Целсиях " + (number - 273));
        }
        if (!(number > 0)) { //аналогично (number<=0)
            System.out.println("Мы не можем преобразовать число в температуру в Цельсиях");
        }

        // если исключить 0 из проверки
        if (number > 0) {
            System.out.println("Температура в Целсиях " + (number - 273));
        }
        if (number < 0) {
            System.out.println("Мы не можем преобразовать число в температуру в Цельсиях");
        }
        if (number == 0) {
            System.out.println("Значение равно 0");
        }
    }
}
