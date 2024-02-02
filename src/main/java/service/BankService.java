package service;

import dto.Account;
import exceptions.AccountCreationException;
import exceptions.AccountException;

import java.util.Collection;

public interface BankService {
    //Create
    Account createAccount(Account newAccount)throws AccountCreationException;
    //Read
    Account getAccountById(Integer accountId)throws AccountException;
    Collection<Account> getAllAccounts();
    //Update
    Double depositFundsById(Integer accountId, Double amount);
    Double withdrawFundsById(Integer accountId, Double amount);
    Boolean updateAccountNameById(Integer accountId,String newName);
    // fund transfer + handle exceptions
    //Delete
    Account deleteAccountById(Integer accountID); // hard delete
    Account deactivateAccount(Integer accountId);
}
