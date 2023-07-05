package de.telran.lesson11;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class IfOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Число до проверки = "+number);

        if (number>0) number++;

        System.out.println("Число после проверки = "+number);

        if (number==0) {
            --number;
            System.out.println("Если равно 0 = " + number);
        }

        if(number<0) return;

        System.out.println("Температура в Целсиях " + (number-273) );
    }
}
