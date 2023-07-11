package de.telran.lesson14.practice;

import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
//        runMenu();
//        runMenuWhile();

        runMenuTrue();
    }

    static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("За кого Вы хотите играть (1,2,Q):");
            System.out.println("1. Эльф");
            System.out.println("2. Орк");
            System.out.println("Q. Выход");
            System.out.print("Сделайте свой выбор: ");
            choice = scanner.next().charAt(0);
            if(ifResultInput(choice))
                System.out.println("Вы сделали ошибку");
        } while (ifResultInput(choice));

        System.out.println("Ваш выбор: "+choice);
    }

    static boolean ifResultInput(char choice) {
        return choice != '1' && choice != '2' && choice != 'Q' && choice != 'q';
    }


    static void runMenuWhile() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        System.out.println("За кого Вы хотите играть (1,2,Q):");
        System.out.println("1. Эльф");
        System.out.println("2. Орк");
        System.out.println("Q. Выход");
        System.out.print("Сделайте свой выбор: ");
        choice = scanner.next().charAt(0);
        while (choice != '1' && choice != '2' && choice != 'Q' && choice != 'q') {
            System.out.println("Вы сделали ошибку");
            System.out.println("За кого Вы хотите играть (1,2,Q):");
            System.out.println("1. Эльф");
            System.out.println("2. Орк");
            System.out.println("Q. Выход");
            System.out.print("Сделайте свой выбор: ");
            choice = scanner.next().charAt(0);
        }
        System.out.println("Ваш выбор: "+choice);
    }

    static void runMenuTrue() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        for (;;) {
            System.out.println("Кем вы хотите играть: (1, 2, Q)");
            System.out.println("1. Elf");
            System.out.println("2. Orc");
            System.out.println("Q. Exit");
            System.out.println("Сделайте свой выбор: ");
            choice = scanner.next().charAt(0);

            if (choice == '1' || choice == '2' || choice == 'Q' || choice == 'q') {
                break;
            }
            System.out.println("Некорректный выбор. Попробуйте еще раз.");
        }

        System.out.println("Ваш выбор: " + choice);
    }

}
