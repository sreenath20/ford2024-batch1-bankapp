package service;

import dto.Account;
import exceptions.AccountCreationException;
import exceptions.AccountException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BankServiceTest {
    //+ve case

    @Test
    public void createAccountTest(){
        BankService bankService = new BankServiceImpl();
        try {
            Assertions.assertNotNull( bankService.createAccount(new
                    Account(1,"Ford",5000.0)));

        } catch (AccountCreationException e) {
            e.printStackTrace();
        }
    }
    // -ve test case
    @Test
    public void createAccountOfNullAccountShouldThrowExceptionTest(){
        BankService bankService = new BankServiceImpl();

            Assertions.assertThrows(AccountCreationException.class,
                    ()->  bankService.createAccount(null) );

    }

    // types of assertions
//    @Test
//    public void testCase1(){
//        Assertions.assertNull();
//        Assertions.assertNotNull();
//        Assertions.assertThrows();
//        Assertions.assertEquals(expected,actual,message);
//        Assertions.assertEquals(25,5*5);
//
//        Assertions.assertNotEquals();
//        Assertions.assertTrue();
//        Assertions.assertFalse();
//        Assertions.assertTimeout(1000,()->service.function());
//
//        Assertions.fail("Test faild because of reason");
//
//        BankService bankService = new BankServiceImpl();
//
//        try {
//            bankService.createAccount(null);
//        } catch (AccountCreationException e) {
//            Assertions.fail("Test faild because of reason"+e.getMessage());
//        }
//
//        Assertions.assertArrayEquals();
//
//    }
    //+ve test case
    @Test
    public void testGetAccountById(){
        // local test data
        BankService bankService = new BankServiceImpl();
        try {
            bankService.createAccount(new Account(205,"India",3000.0));
        } catch (AccountCreationException e) {
            e.printStackTrace();
        }

        try {
            Assertions.assertNotNull(bankService.getAccountById(205));
            Assertions.assertEquals(205,
                    bankService.getAccountById(205).getId());
            Assertions.assertEquals("India",
                    bankService.getAccountById(205).getName());
        } catch (AccountException e) {
            e.printStackTrace();
        }

    }

    //-ve test case
    @Test
    public void getAccountByIdWhenIdNullTest(){
        BankService bankService = new BankServiceImpl();

            Assertions.assertThrows(AccountException.class,()->
            bankService.getAccountById(null));
    }

    @Test
    public void getAccountByIdWhenIdNullMessageTest(){
        BankService bankService = new BankServiceImpl();

        try {
            bankService.getAccountById(null);
        } catch (AccountException e) {
            Assertions.assertEquals("Account id can't be null.",
                    e.getMessage());
        }
    }
}
