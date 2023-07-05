package de.telran.lesson11;

import java.util.Random;

public class NestedIfOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200); // +200
        System.out.println("Число сгенерированное = " + number);

        if(number>100) {
            System.out.println("Человек нарушил правила, предупредить!");
            if (number>130) {
                System.out.println("Человек злостно нарушил, выписать штраф!");
                if(number>170)  System.out.println("Забрать права!");
            }
        }

        // использование логических операторов для задания диапазона
        if(number>100 && number<130)  System.out.println("Человек нарушил правила, предупредить!");
        if(number>130 && number<170)   System.out.println("Человек злостно нарушил, выписать штраф!");
        if(number>170)  System.out.println("Забрать права!");
    }
}
