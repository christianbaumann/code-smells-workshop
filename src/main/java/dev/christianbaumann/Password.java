package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private static final Integer passwordMinimumLength = 11;

public Boolean isPasswordValid(String password) {
    if (!password.isEmpty()) {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            if (password.length() >= passwordMinimumLength) {
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

}

