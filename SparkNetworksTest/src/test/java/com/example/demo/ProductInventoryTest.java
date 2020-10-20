package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.models.ProductInventory;

public class ProductInventoryTest {
	
	ProductInventory productInventory = new ProductInventory();

	@Test
	public void testAddProducts() {
		productInventory.addProduct(5, 10, 15);
		
		assertEquals(5, productInventory.getSparklingWaterQty());
		assertEquals(10, productInventory.getSparkPastaQty());
		assertEquals(15, productInventory.getSparksodaQty());
	}
	
}
