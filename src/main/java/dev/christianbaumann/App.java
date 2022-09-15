package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {


//        System.out.println("foo");
    }


    public Boolean validatePasswordStrength(String password) {
        if (!password.isEmpty()) {
            Pattern p = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(password);
            Boolean hasDigit = m.find();
            if (hasDigit) {
                Boolean longEnough = password.length() > 10;
                if (longEnough) {
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
