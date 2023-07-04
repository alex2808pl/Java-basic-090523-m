package de.telran.lesson8;


import java.util.Random;

public class StudentGenerator {
    public static void main(String[] args) {
        //Генерим номер студента
        Random random = new Random();
        int numStudent = random.nextInt(25) + 1;
        System.out.println("Номер студента = "+numStudent);
        //Работаем с методами
        int sumTemp = sumTwoNumbers(numStudent, 5);
        System.out.println("Сумма номера студента = " + sumTemp);
        System.out.println("Поделим номер студента на целое число= " + divideTwoIntNumbers(numStudent, 0));
        System.out.println("Поделим номера студента = " + divideTwoNumbers(numStudent, 0));
        System.out.println("Поделим номер студента через double = " + divideTwoDoubleInt(numStudent, 2));
        System.out.println("Поделим номер студента на 0 = " + numStudent/1);
        //Ищем четное / нечетное
        findEvenOdd(2);
        findEvenOdd(5);
        findEvenOdd(numStudent);
    }

    static int sumTwoNumbers(int arg1, int arg2) {
        int sumLocal = arg1 + arg2;
        return sumLocal;
    }

    static int divideTwoIntNumbers(int arg1, int arg2) {
        int divLocal = arg1 / arg2;
        return divLocal;
    }

    static double divideTwoNumbers(int arg1, int arg2) {
        double divLocal = (double)arg1 / arg2;
        return divLocal;
    }

    static double divideTwoDoubleInt(double arg1, int arg2) {
        double divLocal = arg1 / arg2;
        return divLocal;
    }
    static void findEvenOdd(int arg) {
        if(arg % 2 == 0) {
            System.out.println(arg+" четное");
        }
        else {
            System.out.println(arg+" нечетное");
        }
    }
}

