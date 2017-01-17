package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

/**
 * SimpleAuthtitificator.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class SimpleAuthenticator
    implements Authenticator {

    @Override
    public boolean auth(User user, String password) {
        return user.getPassword().equals(password);
    }
}
