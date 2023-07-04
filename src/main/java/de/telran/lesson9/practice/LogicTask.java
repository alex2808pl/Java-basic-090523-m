package de.telran.lesson9.practice;

public class LogicTask {
    public static void main(String[] args) {
        int a=1, b=2, c=3, d=0;
        // ложное выражение в if
        if((a < b) && (b == c)) {  //1<2 && 2==3
            d = a + b + c;
            System.out.println("Сумма d = "+d);
        }
        else {
            System.out.println("Ложное значение!!!");
        }
        // истинное выражение в if
        if((a < b) || (b == c)) {  //1<2 || 2==3
            d = a + b + c;
            System.out.println("Сумма d = "+d);
        }
        else {
            System.out.println("Ложное значение!!!");
        }
    }
}
