package ua.goit.offline.login_service.services;

import ua.goit.offline.login_service.model.User;

/**
 * LoginServiceImpl.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class LoginServiceImpl
    implements LoginService {

    private UsersCache usersCache;
    private Authenticator authenticator;

    public boolean login(String name, String password) {
        User user =  usersCache.get(name);
        if (user == null) {
            return false;
        }
        return authenticator.auth(user, password);
    }

    public void setUsersCache(UsersCache usersCache) {
        this.usersCache = usersCache;
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }
}
