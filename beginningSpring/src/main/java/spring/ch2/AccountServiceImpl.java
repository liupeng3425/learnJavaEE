package spring.ch2;

/**
 * Created by Peng on 2016/7/3.
 * AccountServiceImpl
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
        Account sourceAccount = accountDao.find(sourceAccountId);
        Account targetAccount = accountDao.find(targetAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance() - amount);
        accountDao.update(sourceAccount);
        accountDao.update(targetAccount);
    }

    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountDao.find(accountId);
        account.setBalance(account.getBalance() + amount);
        accountDao.update(account);
    }

    public Account getAccount(long accountId) {
        return accountDao.find(accountId);
    }
}
