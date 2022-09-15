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
        boolean passwordIsEmpty = password.isEmpty();
        if (passwordIsEmpty) {
            return false;
        }

        if (!passwordContainsNumber()) {
            return false;
        }

        boolean passwordIsLongEnough = password.length() >= passwordMinimumLength;
        if (!passwordIsLongEnough) {
            return false;
        }

        return true;
    }

    private boolean passwordContainsNumber() {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}

