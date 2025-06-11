package srp;

import java.util.regex.Pattern;

public class User {
    String email;
    String password;

    public boolean isValidEmail() {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public boolean isValidPassword() {
        return password.length() >= 8;
    }
}
