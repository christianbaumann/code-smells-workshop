package dev.christianbaumann.rose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTests {

    @Disabled("Test is failing for demo purposes.")
    @Test
    void foo() {
        // Arrange
        Item item = new Item("foo", 0, 0);
        GildedRose app = new GildedRose(item);

        // Act
        app.updateQuality();

        // Assert
        assertEquals("fixme", app.item.name);
    }
}
