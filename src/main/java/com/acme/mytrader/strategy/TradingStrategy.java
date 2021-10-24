package com.acme.mytrader.strategy;
import com.acme.mytrader.price.PriceListener;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy implements PriceListener{
	
	private final int thresholdPrice = 100;
	private boolean isBought = false;
	
	@Override
	public boolean priceUpdate(String security, double price) {
	    isBought = buyStock(security,price);
	    return isBought;
	}
	
	private boolean buyStock(String security, double price) {
		if (price >= thresholdPrice){
			// actually we can write a logic to execute the trade here. But for now, we are just returning a boolean
			return true;
		}
		return isBought;
	}
}