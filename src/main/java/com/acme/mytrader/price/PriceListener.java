package com.acme.mytrader.price;

public interface PriceListener {
    boolean priceUpdate(String security, double price);
}
