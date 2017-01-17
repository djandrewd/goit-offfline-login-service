package ua.goit.offline.login_service.services;

/**
 * LoginService.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public interface LoginService {
    boolean login(String name, String password);
}
