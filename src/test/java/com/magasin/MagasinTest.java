package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void diot() {
        Item[] items = new Item[]{new Item("Diot", 5, 5)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 5; i++) {
            app.updateQuality();
        }
        assertEquals("Diot", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void comteQuality() {
        Item[] items = new Item[]{new Item("Comté", 2, 10)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 3; i++) {
            app.updateQuality();
        }
        assertEquals(14, app.items[0].quality);
    }

    @Test
    void comteSellIN() {
        Item[] items = new Item[]{new Item("Comté", 2, 10)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 2; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);

    }

    @Test
    void conteName() {
        Item[] items = new Item[]{new Item("Comté", 2, 10)};
        Magasin app = new Magasin(items);

        app.updateQuality();

        assertEquals("Comté", app.items[0].name);
    }


    @Test
    void kryptoniteQuality() {
        Item[] items = new Item[]{new Item("Kryptonite", 5, 80)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 6; i++) {
            app.updateQuality();
        }
        assertEquals(5, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);

    }
    @Test
    void passVIPQuality(){
        Item[] items = new Item[]{new Item("Pass VIP Concert", 2, 50)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 2; i++) {
            app.updateQuality();
        }
        assertEquals(50, app.items[0].quality);
    }
    @Test
    void passVIPSellIn() {
        Item[] items = new Item[]{new Item("Comté", 2, 10)};
        Magasin app = new Magasin(items);
        for (int i = 1; i <= 2; i++) {
            app.updateQuality();
        }
        assertEquals(0, app.items[0].sellIn);

    }
//    @Test
//    void
}


