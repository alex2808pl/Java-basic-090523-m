package de.telran.lesson21.practice;

public class TestAccount {
    public static void main(String[] args) {
        String badAccount = "3245545675687";
        System.out.println("Account = "+ badAccount+
                " is "+Accounts.isValidAccountNumber(badAccount));

        String goodAccount = "56773655989779";
        System.out.println("Account = "+ goodAccount+
                " is "+Accounts.isValidAccountNumber(goodAccount));
    }
}
