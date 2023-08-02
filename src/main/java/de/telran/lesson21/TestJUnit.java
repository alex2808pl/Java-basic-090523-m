package de.telran.lesson21;

import java.util.Arrays;

public class TestJUnit {
    public static void main(String[] args) {
        int[] arr = Utils.getNumber();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        System.out.println("Max = "+ Utils.findMax(arr));
//        System.out.println(arr[4]);2

    }
}
