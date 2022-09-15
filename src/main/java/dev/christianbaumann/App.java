package dev.christianbaumann;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {


//        System.out.println("foo");
    }


    public Boolean validatePasswordStrength(String password) {
        if (!password.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
