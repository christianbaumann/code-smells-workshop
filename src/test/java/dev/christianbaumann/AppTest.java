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
    public void nonEmptyPasswordGetsAccepted() {
        assertTrue(app.validatePasswordStrength("password"));
    }
}
