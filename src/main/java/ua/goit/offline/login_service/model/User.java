package ua.goit.offline.login_service.model;

/**
 * User.
 *
 * @author Andrey Minov (andrey.minov@playtech.com)
 * @since 2017.01
 */
public class User {

    private String name;
    private String password;
    /// other info

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", password='" + password + '\'' + '}';
    }
}
