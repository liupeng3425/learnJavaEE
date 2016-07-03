package spring.ch2;

/**
 * Created by Peng on 2016/7/3.
 * AccountService
 */
public interface AccountService {
    public void transferMoney(long sourceAccountId, long targetAccountId, double amount);

    public void depositMoney(long accountId, double amount) throws Exception;

    public Account getAccount(long accountId);
}
