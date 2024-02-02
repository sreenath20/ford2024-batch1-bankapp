package controller;

import dto.Account;
import exceptions.AccountCreationException;
import exceptions.AccountException;
import service.BankService;
import service.BankServiceImpl;

public class Client {

    public static void main(String[] a){

        BankService bankService = new BankServiceImpl();
        try {
            bankService.createAccount(new Account(101,"India",5500.0));
            bankService.createAccount(new Account(102,"Japan",3500.0));

            System.out.println("All Accouts:"+bankService.getAllAccounts());

            Account foundAccount = bankService.getAccountById(105);
            System.out.println("Found :"+foundAccount);
            //bankService.createAccount(null);
        } catch (AccountCreationException e) {
            System.out.println(e.getMessage());
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }

    }

}
