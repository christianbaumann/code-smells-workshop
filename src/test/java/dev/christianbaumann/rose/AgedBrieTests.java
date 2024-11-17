package dev.christianbaumann.rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTests {

    private Item item;

    @Test
    public void testQualityIncreasesBy1BeforeSellinExpired() {
        item = new Item("Aged Brie", 5, 10);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(11, app.item.quality);
    }

    @Test
    public void testQualityIncreasesBy2WhenSellinIs0() {
        item = new Item("Aged Brie", 0, 12);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(-1, app.item.sellIn);
        assertEquals(14, app.item.quality);
    }

    @Test
    public void testQualityIncreasesBy2WhenSellinIsMinus1() {
        item = new Item("Aged Brie", -1, 16);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(-2, app.item.sellIn);
        assertEquals(18, app.item.quality);
    }

    @Test
    public void testQualityIncreasesBy2WhenSellinIsMinus5() {
        item = new Item("Aged Brie", -5, 18);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(-6, app.item.sellIn);
        assertEquals(20, app.item.quality);
    }

    @Test
    public void testQualityNotGreater50Sellin17() {
        item = new Item("Aged Brie", 17, 49);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(16, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testQualityNotGreater50SellIn4711() {
        item = new Item("Aged Brie", 4711, 50);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(4710, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testQualityNotGreater50SellinMinus3() {
        item = new Item("Aged Brie", -3, 48);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(-4, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testQualityNotGreater50SellinMinus666() {
        item = new Item("Aged Brie", -666, 49);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Aged Brie", app.item.name);
        assertEquals(-667, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

}
