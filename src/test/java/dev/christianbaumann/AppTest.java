package dev.christianbaumann;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest {

    private App app = new App();

    @Test
    public void shouldReturnFalse(){
        assertFalse(app.validatePasswordStrength(""));
    }
}
