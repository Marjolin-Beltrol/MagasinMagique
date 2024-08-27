package com.magasin;

class MagasinRefacto {
    Item[] items;

    public MagasinRefacto(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Comté":
                    items[i].sellIn = 50;
                    if (items[i].quality <= 50) {
                        items[i].quality = items[i].quality + 1;
                        items[i].sellIn = items[i].sellIn - 1;
                    }
                    break;
                case "Pass VIP Concert":
                    items[i].sellIn = 50;
                    if (items[i].quality <= 50 && items[i].sellIn > 11) {
                        items[i].quality = items[i].quality + 1;
                        items[i].sellIn = items[i].sellIn - 1;
                    }
                    if (items[i].quality <= 50 && items[i].sellIn <= 10) {
                        items[i].quality = items[i].quality + 2;
                        items[i].sellIn = items[i].sellIn - 1;
                    }
                    if (items[i].quality <= 50 && items[i].sellIn <= 3) {
                        items[i].quality = items[i].quality + 3;
                        items[i].sellIn = items[i].sellIn - 1;
                    }
                    if (items[i].sellIn < 0) {
                         items[i].quality = 0;
                    }
                    break;
            }
//            if (!items[i].name.equals("Comté")
//                    && !items[i].name.equals("Pass VIP Concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Kryptonite")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Kryptonite")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Comté")) {
//                    if (!items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Kryptonite")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }


        }
    }
}