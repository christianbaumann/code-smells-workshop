package dev.christianbaumann.rose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackstagePassTests {

    private Item item;

    @Test
    public void testPass10Days0() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 3);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(10, app.item.sellIn);
        assertEquals(4, app.item.quality);
    }

    @Test
    public void testPass10Days1() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 4);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(9, app.item.sellIn);
        assertEquals(6, app.item.quality);
    }

    @Test
    public void testPass10Days2() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 5);

        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(8, app.item.sellIn);
        assertEquals(7, app.item.quality);
    }

    @Test
    public void testPass5Days0() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 6);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(5, app.item.sellIn);
        assertEquals(8, app.item.quality);
    }

    @Test
    public void testPass5Days1() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 7);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(10, app.item.quality);
    }

    @Test
    public void testPass5Days2() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 8);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(3, app.item.sellIn);
        assertEquals(11, app.item.quality);
    }

    @Test
    public void testPassAfterTheConcert0() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 9);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(0, app.item.sellIn);
        assertEquals(12, app.item.quality);

    }

    @Test
    public void testPassAfterTheConcert1() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(-1, app.item.sellIn);
        assertEquals(0, app.item.quality);
    }

    @Test
    public void testPassAfterTheConcert2() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 11);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(-2, app.item.sellIn);
        assertEquals(0, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_0() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(9, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_1() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(9, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_2() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(9, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_3() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 47);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_4() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_5() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }

    @Test
    public void testPassQualityNotGreater50_6() {
        item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50);
        GildedRose app = new GildedRose(item);

        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.item.name);
        assertEquals(4, app.item.sellIn);
        assertEquals(50, app.item.quality);
    }
}
