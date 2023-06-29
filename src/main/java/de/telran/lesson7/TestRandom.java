package de.telran.lesson7;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        int myInt = 5;
        System.out.println(myInt);

        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println(myInt);

        Random random = new Random();
        myInt = random.nextInt(20)-10;
        System.out.println(myInt);

        double myDbl = random.nextDouble();
        System.out.println(myDbl);

        float myFlt = random.nextFloat();
        System.out.println(myFlt);

        boolean myBool = random.nextBoolean();
        System.out.println(myBool);

        //создать случайное число с цело и дробной частью
        System.out.println(myDbl+myInt);

    }
}
