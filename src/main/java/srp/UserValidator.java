package srp;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateUser(String email, String password) {
        return isValidEmail(email) && isValidPassword(password);
    }

    private boolean isValidEmail(String email) {
        if (email == null) return false;
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    private boolean isValidPassword(String password) {
        if (password == null) return false;
        return password.length() >= 8;
    }
}