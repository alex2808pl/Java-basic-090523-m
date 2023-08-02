package de.telran.lesson21.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {


    @Test
    void isValidAccountNumber_length14() {
        String badAccountLess14 = "124345435345";
        String badAccountMore14 = "32434543534512864";
        assertFalse(Accounts.isValidAccountNumber(badAccountLess14));
        assertFalse(Accounts.isValidAccountNumber(badAccountMore14));
    }

    @Test
    void isValidAccountNumber_allNumberNot0() {
        String badAccountAll0 = "00000000000000";
        assertFalse(Accounts.isValidAccountNumber(badAccountAll0));
    }

    @Test
    void isValidAccountNumber_notNull_notEmpty() {
        assertFalse(Accounts.isValidAccountNumber(null));
        assertFalse(Accounts.isValidAccountNumber(""));
    }

    @Test
    void isValidAccountNumber_correct() {
        String gootAccount = "32434543534512";
        assertTrue(Accounts.isValidAccountNumber(gootAccount));
    }
}