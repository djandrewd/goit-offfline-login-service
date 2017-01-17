package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * UsersCacheImpl.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class UsersCacheImpl
    implements UsersCache {

    private Map<String, User> cache;
    private UserService service;

    public User get(String name) {
        return cache.computeIfAbsent(name, k -> service.load(name));
    }

    public void setService(UserService service) {
        this.service = service;
    }

    public void setCache(Map<String, User> cache) {
        this.cache = cache;
    }
}
