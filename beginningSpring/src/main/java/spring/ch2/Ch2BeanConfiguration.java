package spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Peng on 2016/7/3.
 * Ch2BeanConfiguration
 */

@Configuration
public class Ch2BeanConfiguration {

    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }

    @Bean
    public AccountDao accountDao() {
        // dependencies of accountDao bean will be injected here...
        return new AccountDaoInMemoryImpl();
    }
}
