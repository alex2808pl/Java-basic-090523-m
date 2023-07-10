package de.telran.lesson13.practice;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println("Сумма всех входящих чисел от 0 до Мах = "+sumMaxNumber(4, 3));
    }

    static int sumMaxNumber(int numb1, int numb2) {
        int sum = 0;
        int maxNumb = (numb1 > numb2) ? numb1 : numb2;

/*        //аналог
        if(numb1 > numb2) maxNumb = numb1;
        else maxNumb = numb2;*/

        System.out.println("Max число = "+maxNumb);
        for (int val = 1; val <= maxNumb; val++) sum += val; //sum = sum + val
        return sum;
    }
}
