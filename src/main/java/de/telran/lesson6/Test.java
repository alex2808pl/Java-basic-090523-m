package de.telran.lesson6;

public class Test {

    public int myIntTest;

    public Test() {
        System.out.println("started Test()");
        myIntTest = 1;
    }

//    public Test(int myInt) {
//        System.out.println("started Test(int myInt)");
//        myIntTest = myInt;
//    }

    public Test(int myIntTest) {
        System.out.println("started Test(int myInt)");
        this.myIntTest = myIntTest;
    }

    public void run() {
        myIntTest = myIntTest + 2;
        this.myIntTest = this.myIntTest + 2;
        System.out.println("Test -> run() "+myIntTest);
    }
}
