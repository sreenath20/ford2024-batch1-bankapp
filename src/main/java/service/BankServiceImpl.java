package service;

import dto.Account;
import exceptions.AccountCreationException;
import exceptions.AccountException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService{

    private Map<Integer,Account> accountMap;

    public BankServiceImpl() {
         accountMap = new HashMap<>();
    }

    @Override
    public Account createAccount(Account newAccount)throws AccountCreationException {
//        // handle account null exception
//        if(newAccount == null) throw new AccountCreationException("Account can't be null");
//        this.accountMap.put(newAccount.getId(), newAccount);
//        return this.accountMap.get(newAccount.getId());
        return null;
    }
    @Override
    public Collection<Account> getAllAccounts() {
        return this.accountMap.values();
    }

    @Override
    public Account getAccountById(Integer accountId)throws AccountException {
        if(accountId == null)
            throw new AccountException("Account id can't be null.");
//        if( ! this.accountMap.containsKey(accountId))
//            throw new AccountException("Account id :"+ accountId +" does not exists.");
              return this.accountMap.get(accountId);

    }




    @Override
    public Double depositFundsById(Integer accountId, Double amount) {
        return null;
    }

    @Override
    public Double withdrawFundsById(Integer accountId, Double amount) {
        return null;
    }

    @Override
    public Boolean updateAccountNameById(Integer accountId, String newName) {
        return null;
    }

    @Override
    public Account deleteAccountById(Integer accountID) {
        return null;
    }

    @Override
    public Account deactivateAccount(Integer accountId) {
        return null;
    }
}
