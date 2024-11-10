package dev.christianbaumann.rose;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTests {

    @Ignore
    @Test
    public void foo() {
        Item item = new Item("foo", 0, 0);
        GildedRose app = new GildedRose(item);
        app.updateQuality();
        assertEquals("fixme", app.item.name);
    }
}
