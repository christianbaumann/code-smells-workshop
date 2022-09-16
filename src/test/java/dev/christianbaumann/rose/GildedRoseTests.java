package dev.christianbaumann.rose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTests {

    @Test
    public void foo() {
        Item item = new Item("foo", 0, 0);
        GildedRose app = new GildedRose(item);
        app.updateQuality();
        assertEquals("foo", app.item.name);
    }
}
