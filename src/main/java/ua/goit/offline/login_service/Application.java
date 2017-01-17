package ua.goit.offline.login_service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.goit.offline.login_service.services.LoginService;
import ua.goit.offline.login_service.services.UsersCache;

/**
 * Application.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
        LoginService service = (LoginService) applicationContext.getBean("loginService");
        System.out.println(service.login("test", "test1"));
    }
}
