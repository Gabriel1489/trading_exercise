package com.acme.mytrader.strategy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TradingStrategyTest {

	
	@Test
    public void testThresholdLess() {
      
      TradingStrategy tradingStrategy = new TradingStrategy();
      boolean result = tradingStrategy.priceUpdate("Apple", 99);
      System.out.println(result);
      assertFalse(result); // Returns false, since the threshold is 100 according to the value set in the Trading Strategy class.
      // and this value of Apple share is less than 100
      
    }
    
    @Test
    public void testThresholdMore() {
      
      TradingStrategy tradingStrategy = new TradingStrategy();
      boolean result2 = tradingStrategy.priceUpdate("IBM", 100);
      System.out.println(result2);
      assertTrue(result2); // Returns True, since the threshold is 100 according to the value set in the Trading Strategy class
      // and this value of IBM share is more than 100
      
      
    }
    
 // Interchanging the assert(False and True) will fail the test case. 

}
