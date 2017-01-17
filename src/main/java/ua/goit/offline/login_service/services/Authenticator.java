package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

/**
 * Authenticator.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public interface Authenticator {
    boolean auth(User user, String password);
}
