package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

/**
 * UsersCache.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public interface UsersCache {

    User get(String name);
}
