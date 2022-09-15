package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

public Boolean isPasswordValid(String password) {
    if (!password.isEmpty()) {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            if (password.length() > 10) {
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

