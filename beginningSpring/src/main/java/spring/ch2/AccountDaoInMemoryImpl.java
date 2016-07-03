package spring.ch2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Peng on 2016/7/3.
 * AccountDaoInMemoryImpl
 */
@Repository
public class AccountDaoInMemoryImpl implements AccountDao {
    private Map<Long, Account> accountsMap = new HashMap<Long, Account>();

    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);

        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);
    }

    public List<Account> find(boolean locked) {
        return null;
    }

    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    public void update(List<Account> accounts) {
        for (Account account : accounts)
            accountsMap.put(account.getId(), account);
    }

    public void delete(long accountId) {
        accountsMap.remove(accountId);
    }

    public Account find(long accountId) {
        for (Map.Entry<Long, Account> account : accountsMap.entrySet()) {
            if (account.getValue().getId() == accountId) return account.getValue();
        }
        return null;
    }

    public List<Account> find(List<Long> accountIds) {
        List<Account> accounts = new ArrayList<Account>();
        for (Long id:accountIds) accounts.add(accountsMap.get(id));
        return accounts;
    }

    public List<Account> find(String ownerName) {
        List<Account> accounts = new ArrayList<Account>();
        for (Map.Entry<Long, Account> account : accountsMap.entrySet()) {
            if (account.getValue().getOwnerName().equals(ownerName)) accounts.add(account.getValue());
        }
        return accounts;
    }
}
