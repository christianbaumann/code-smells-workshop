package dev.christianbaumann.rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTests {

    private Item item;

    @Test
    public void testDoesNotChangeQualitySellin5() {
        item = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.item.name);
        assertEquals(5, app.item.sellIn);
        assertEquals(10, app.item.quality);
    }

    @Test
    public void testDoesNotChangeQualitySellin1() {
        item = new Item("Sulfuras, Hand of Ragnaros", 1, 12);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.item.name);
        assertEquals(1, app.item.sellIn);
        assertEquals(12, app.item.quality);
    }

    @Test
    public void testDoesNotChangeQualitySellin0() {
        item = new Item("Sulfuras, Hand of Ragnaros", 0, 14);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.item.name);
        assertEquals(0, app.item.sellIn);
        assertEquals(14, app.item.quality);
    }

    @Test
    public void testDoesNotChangeQualitySellinMinus1() {
        item = new Item("Sulfuras, Hand of Ragnaros", -1, 16);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.item.name);
        assertEquals(-1, app.item.sellIn);
        assertEquals(16, app.item.quality);
    }

    @Test
    public void testDoesNotChangeQualitySellinMinus5() {
        item = new Item("Sulfuras, Hand of Ragnaros", -5, 18);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.item.name);
        assertEquals(-5, app.item.sellIn);
        assertEquals(18, app.item.quality);
    }
}
