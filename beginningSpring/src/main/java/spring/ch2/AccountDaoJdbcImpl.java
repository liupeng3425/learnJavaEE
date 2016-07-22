package spring.ch2;

import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * Created by Peng on 2016/7/7.
 * AccountDaoJdbcImpl
 */
public class AccountDaoJdbcImpl implements AccountDao {



    public void insert(Account account) {

    }

    public void update(Account account) {

    }

    public void update(List<Account> accounts) {

    }

    public void delete(long accountId) {

    }

    public Account find(long accountId) {
        return null;
    }

    public List<Account> find(List<Long> accountIds) {
        return null;
    }

    public List<Account> find(String ownerName) {
        return null;
    }

    public List<Account> find(boolean locked) {
        return null;
    }
}
