package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

public Boolean validatePasswordStrength(String p) {
    if (!p.isEmpty()) {
        Pattern pa = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        Matcher m = pa.matcher(p);
        if (m.find()) {
            if (p.length() > 10) {
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

