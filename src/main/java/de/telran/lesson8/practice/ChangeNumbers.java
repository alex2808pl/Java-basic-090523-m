package de.telran.lesson8.practice;

public class ChangeNumbers {
    public static void main(String[] args) {
        changeWithTemp(10, 25);
        changeWithOutTemp(10, 25);
    }

    // метод для обмена информацией с временной переменной
    static void changeWithTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 ="+arg2);
        int tempArg = arg1;
        arg1 = arg2;
        arg2 = tempArg;
        System.out.println("После обмена: arg1 = "+arg1+" arg2 ="+arg2);
    }

    // метод для обмена информацией без временной переменной
    static void changeWithOutTemp(int arg1, int arg2) {
        System.out.println("До: arg1 = "+arg1+" arg2 ="+arg2);
        arg1 = arg1 + arg2;
        arg2 = arg1 - arg2;
        arg1 = arg1 - arg2;
        System.out.println("После обмена: arg1 = "+arg1+" arg2 ="+arg2);
    }
}
