package dev.christianbaumann;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PasswordTests {

    private Password password = new Password();

    @Test
    public void emptyPasswordGetsRejected() {
        assertFalse(password.isPasswordValid(""));
    }

    @Test
    public void tooShortPasswordWithNumberGetsRejected() {
        assertFalse(password.isPasswordValid("password1"));
    }

    @Test
    public void tooShortPasswordWithoutNumberGetsRejected() {
        assertFalse(password.isPasswordValid("password"));
    }

    @Test
    public void longEnoughPasswordWithoutNumberGetsRejected() {
        assertFalse(password.isPasswordValid("aVeryLongPassword"));
    }

    @Test
    public void longEnoughPasswordWithNumberGetsAccepted() {
        assertTrue(password.isPasswordValid("longPasswordWithA123"));
    }
}
