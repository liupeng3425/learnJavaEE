package spring.ch2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Peng on 2016/7/3.
 * main
 * 实例化Spring容器
 */
public class Application {
    public static void main(String[] args) {
//        //基于java注解的配置来创建和使用容器
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(Ch2BeanConfiguration.class);

//        //基于xml的配置来创建和使用容器
//        ClassPathXmlApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("ch2-beans.xml");

        //基于java注解@service @Autowired 不需要Ch2BeanConfiguration
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ch2-autowired.xml");

        //在spring容器内部访问accountService bean
        AccountService accountService =
                applicationContext.getBean("accountService", AccountService.class);
        System.out.println("Before money transfer");
        System.out.println("Account 1 balance :" +
                accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" +
                accountService.getAccount(2).getBalance());

        accountService.transferMoney(1, 2, 5);
        System.out.println("After money transfer");
        System.out.println("Account 1 balance :" +
                accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance :" +
                accountService.getAccount(2).getBalance());

    }

}
