package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private static final Integer passwordMinimumLength = 11;

public Boolean isPasswordValid(String password) {
    boolean passwordIsNotEmpty = !password.isEmpty();
    if (passwordIsNotEmpty) {
        Pattern pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean passwordHasNumber = matcher.find();
        if (passwordHasNumber) {
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

}

