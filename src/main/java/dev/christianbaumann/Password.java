package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public Boolean validatePasswordStrength(String password) {
        if (!password.isEmpty()) {
            Pattern p = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(password);
            if (m.find()) {
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
