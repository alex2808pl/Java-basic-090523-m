package de.telran.lesson4;

public class ConversionType {
    public static void main(String[] args) {
        byte myByte = 64;
        int myInt = myByte;

        long myLong = 4566;
        myByte = (byte)myLong;
        System.out.println(myLong);
        System.out.println(myByte);
    }
}
