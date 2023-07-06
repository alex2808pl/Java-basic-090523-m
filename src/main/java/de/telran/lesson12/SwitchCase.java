package de.telran.lesson12;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число дня недели = ");
        String outNameDay = "";
        outNameDay = getNameDayOfWeekIfElse(scanner.nextInt());
        System.out.println("Имя дня недели = " + outNameDay);

        System.out.print("\nВведите число дня недели = ");
        outNameDay = getNameDayOfWeekSwitchCase(scanner.nextInt());
        System.out.println("Имя дня недели = " + outNameDay);
    }

    static String getNameDayOfWeekIfElse(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящее число! - " + dayOfWeek);
            return "День недели должен быть от 1...7";
        }
        String nameDayOfWeek = "";
        if (dayOfWeek == 1) nameDayOfWeek = "понедельник";
        else if (dayOfWeek == 2) nameDayOfWeek = "вторник";
        else if (dayOfWeek == 3) nameDayOfWeek = "среда";
        else if (dayOfWeek == 4) nameDayOfWeek = "четверг";
        else if (dayOfWeek == 5) nameDayOfWeek = "пятница";
        else if (dayOfWeek == 6) nameDayOfWeek = "суббота";
        else if (dayOfWeek == 7) nameDayOfWeek = "воскресенье";
        else nameDayOfWeek = "Не корректное число";

        return nameDayOfWeek;
    }

    static String getNameDayOfWeekSwitchCase(int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            System.out.println("Не корректное входящее число! - " + dayOfWeek);
            return "День недели должен быть от 1...7";
        }
        String nameDayOfWeek = "";
        switch (dayOfWeek) {
            case 1:
                nameDayOfWeek = "понедельник";
                break;
            case 2:
                nameDayOfWeek = "вторник";
                break;
            case 3:
                nameDayOfWeek = "среда";
                break;
            case 4:
                nameDayOfWeek = "четверг";
                break;
            case 5:
                nameDayOfWeek = "пятница";
                break;
            case 6:
                nameDayOfWeek = "суббота";
                break;
            case 7:
                nameDayOfWeek = "воскресенье";
                break;
            default:
                nameDayOfWeek = "Не корректное число";
        }

        return nameDayOfWeek;
    }
}
