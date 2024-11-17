package dev.christianbaumann.rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalTests {

    private Item item;

    @Test
    public void testQualityDoesNotGoBelow0() {
        item = new Item("Normal", 5, 0);

        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Normal", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(0, app.item.quality);
    }

    @Test
    public void testQualityIncreasesBeforeSellinExpired() {
        item = new Item("Normal", 5, 10);

        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Normal", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(9, app.item.quality);
    }

    @Test
    public void testQualityDecreasesBy2AtSellinMinus1() {
        item = new Item("Normal", -1, 16);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Normal", app.item.name);
        assertEquals(-2, app.item.sellIn);
        assertEquals(14, app.item.quality);
    }

    @Test
    public void testQualityDecreasesBy2AtSellinMinus5() {
        item = new Item("Normal", -5, 18);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Normal", app.item.name);
        assertEquals(-6, app.item.sellIn);
        assertEquals(16, app.item.quality);
    }

    @Test
    public void testQualityDecreasesBy2AtSellin0() {
        item = new Item("Normal", 0, 14);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Normal", app.item.name);
        assertEquals(-1, app.item.sellIn);
        assertEquals(12, app.item.quality);
    }
}
