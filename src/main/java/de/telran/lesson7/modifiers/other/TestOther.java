package de.telran.lesson7.modifiers.other;

public class TestOther {
    public static int intStatic = 5;
    int intDefault = 1;
    public int intPublic = 2;
    private int intPrivate = 3;
    protected int intProtected = 4;

    public void testMethod() {
        System.out.println("Я testMethod() в классе TestOther");
        System.out.println(intDefault);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);
    }
}
