package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.models.CurrencyInventory;
import com.example.demo.models.ProductInventory;
import com.example.demo.models.PurchaseProduct;

public class PurchaseProductTest {
	
	ProductInventory productInventory = new ProductInventory(10,20,30);
	
	CurrencyInventory currencyInventory = new CurrencyInventory(50,50,100,100);
	
	PurchaseProduct purchaseProduct = new PurchaseProduct(productInventory,currencyInventory);
	
	@Test
	public void testBuyOne() {
		
		//assertEquals(expected, actual);
		//purchaseProduct.buyOne("SparklingWater", 26);
		assertEquals(1,purchaseProduct.buyOne("SparklingWater", 26));
		assertEquals(9,productInventory.getSparklingWaterQty());
	}

}
