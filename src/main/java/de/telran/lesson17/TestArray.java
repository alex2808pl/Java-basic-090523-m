package de.telran.lesson17;

import java.util.Arrays;
import java.util.Random;

public class TestArray {
    int elemClass;
    public static void main(String[] args) {
        int[] arrInt; //null
        arrInt = new int[10]; //первый вариант
        for (int val : arrInt) System.out.println(val); //foreach

        Random random = new Random();
        for (int i=0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(100); //arrInt[0], arrInt[1]...
            System.out.println("arrInt["+i+"] = "+arrInt[i]);
        }
        arrInt[5] = 333; //явное изменение
        arrInt[arrInt.length-1] = 999;
        for (int val : arrInt) System.out.println(val); //foreach

        System.out.println();

        // ручное увеличение размера нашего массива до 15 того же массива arrInt
        arrInt = copyArray(arrInt, 15);
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива

        //аналогичное увеличение массива на 20 с помощью библиотечной функции copyOf
        arrInt = Arrays.copyOf(arrInt, 20);
        System.out.println("-- arrInt --");
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива

        //копирование массива в другой объект
        int[] newArrInt = Arrays.copyOf(arrInt, arrInt.length); //библиотечным методом
        int[] newArrInt1 = copyArray(arrInt, arrInt.length); //нашим ручным методом

        System.out.println("--- newArrInt --- ");
        for(int val : newArrInt) System.out.println(val);

        //меняем все значения на -1 в копии
        for (int i=0; i<newArrInt.length; i++) newArrInt[i] = -1;
        System.out.println("--- newArrInt --- копия");
        for(int val : newArrInt) System.out.println(val);

        System.out.println("-- arrInt -- оригинал");
        for (int val : arrInt) System.out.println(val); //foreach  val - значение элемента массива





//        String[] arrString = new String[5];
//        for (String val : arrString) System.out.println(val); //foreach
//
//        int[] arrIntInit = {88,2,3,4,5,6,7}; //new int[7] = ...
//        for (int val : arrIntInit) System.out.println(val); //foreach

//        System.out.println(arrInt);
    }

    static int[] copyArray(int[] oldArr, int newSize) { //15
        if(oldArr.length > newSize) return null;

        int[] newArr = new int[newSize];
        for (int i=0; i<oldArr.length; i++) newArr[i] = oldArr[i];
        return newArr;
    }
}
