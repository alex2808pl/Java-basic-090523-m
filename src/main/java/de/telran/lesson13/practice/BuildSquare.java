package de.telran.lesson13.practice;

import java.util.Scanner;

public class BuildSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту = ");
        int height = scanner.nextInt();
        System.out.print("Введите ширину = ");
        int width = scanner.nextInt();
        build(width,height);
    }
    static void build(int width, int height) {
        for(int j = 0; j < height; j++) { //по высоте
            for(int i = 0; i < width; i++) { // по ширине
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}

// для трехмерного
// for(z = 0;...)
//   for(y = 0; ...)
//         for (x = 0; ...)
