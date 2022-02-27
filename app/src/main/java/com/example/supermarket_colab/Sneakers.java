package com.example.supermarket_colab;

public class Sneakers {

    private int mPrice;

    private String mTitle;

    private String mUrl;

    public Sneakers(int price, String title, String url) {
        mPrice = price;
        mTitle = title;
        mUrl = url;
    }

    public String getmUrl() {
        return mUrl;
    }

    public int getmPrice() {
        return mPrice;
    }

    public String getmTitle() {
        return mTitle;
    }
}
