package com.company;

public class Lily {
    private int price;
    private int freshness;
    private int stem_length;

    public Lily(int price, int freshness, int stem_length) {
        this.price = price;
        this.freshness = freshness;
        this.stem_length = stem_length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getStem_length() {
        return stem_length;
    }

    public void setStem_length(int stem_length) {
        this.stem_length = stem_length;
    }
}
