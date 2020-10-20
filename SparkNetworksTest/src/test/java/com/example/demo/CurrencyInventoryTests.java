package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.models.CurrencyInventory;

public class CurrencyInventoryTests {

	CurrencyInventory currencyInventory = new CurrencyInventory();
	
	
	@Test
	public void testAddCoins() {
		currencyInventory.addCoins(5, 7, 10, 17);
		
		assertEquals(currencyInventory.getCoinFiveQty(), 7 );
		assertEquals(currencyInventory.getCoinOneQty(), 5 );
		assertEquals(currencyInventory.getCoinTenQty(), 10 );
		assertEquals(currencyInventory.getCoinTwentyFiveQty(), 17 );
	}
	
}
