package dev.christianbaumann.password;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordTests {

    @Test
    public void emptyPasswordGetsRejected() {
        Password password = new Password("");
        assertFalse(password.isPasswordValid());
    }

    @Test
    public void tooShortPasswordWithNumberGetsRejected() {
        Password password = new Password("password1");
        assertFalse(password.isPasswordValid());
    }

    @Test
    public void tooShortPasswordWithoutNumberGetsRejected() {
        Password password = new Password("password");
        assertFalse(password.isPasswordValid());
    }

    @Test
    public void longEnoughPasswordWithoutNumberGetsRejected() {
        Password password = new Password("aVeryLongPassword");
        assertFalse(password.isPasswordValid());
    }

    @Test
    public void longEnoughPasswordWithNumberGetsAccepted() {
        Password password = new Password("longPasswordWithA123");
        assertTrue(password.isPasswordValid());
    }
}
