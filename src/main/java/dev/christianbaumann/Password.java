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
        if (password.isEmpty()) {
            return false;
        }
        if (passwordContainsNoDigit()) {
            return false;
        }
        if (password.length() < passwordMinimumLength) {
            return false;
        }
        return true;
    }

    private boolean passwordContainsNoDigit() {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        return !matcher.find();
    }

}

