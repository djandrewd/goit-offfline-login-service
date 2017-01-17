package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

/**
 * UserService.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class UserService {

    public User load(String name) {
        System.out.println("Create new user: " + name);
        return new User(name, "test");
    }
}
