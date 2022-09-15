package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private static final Integer passwordMinimumLength = 11;
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public Boolean isPasswordValid() {
    boolean passwordIsNotEmpty = !password.isEmpty();
    if (passwordIsNotEmpty) {
        if (passwordContainsNumber()) {
            boolean passwordIsLongEnough = password.length() >= passwordMinimumLength;
            if (passwordIsLongEnough) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } else {
        return false;
    }
}

    private boolean passwordContainsNumber() {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}

