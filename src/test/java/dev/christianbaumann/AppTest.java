package dev.christianbaumann;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest {

    private App app = new App();

    @Test
    public void emptyPasswordGetsRejected() {
        assertFalse(app.validatePasswordStrength(""));
    }

    @Test
    public void tooShortPasswordWithNumberGetsRejected() {
        assertFalse(app.validatePasswordStrength("password1"));
    }

    @Test
    public void tooShortPasswordWithoutNumberGetsRejected() {
        assertFalse(app.validatePasswordStrength("password"));
    }

    @Test
    public void longEnoughPasswordWithoutNumberGetsRejected() {
        assertFalse(app.validatePasswordStrength("aVeryLongPassword"));
    }

    @Test
    public void longEnoughPasswordWithNumberGetsAccepted() {
        assertTrue(app.validatePasswordStrength("longPasswordWithA123"));
    }
}
