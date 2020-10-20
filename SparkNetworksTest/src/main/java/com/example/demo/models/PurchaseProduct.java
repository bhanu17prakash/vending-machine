package com.example.demo.models;

public class PurchaseProduct {
	
	ProductInventory productInventory;
	
	CurrencyInventory currencyInventory;
	
	
	
	public PurchaseProduct(ProductInventory productInventory, CurrencyInventory currencyInventory) {
		super();
		this.productInventory = productInventory;
		this.currencyInventory = currencyInventory;
	}



	public int buyOne(String productName, int price) {
		
		int remainingChange= 0;
		
		if(price >= 25 && productName.equalsIgnoreCase("SparklingWater") && productInventory.getSparklingWaterQty()>0 && currencyInventory.getTotalValue() >= price-25) {
			
			int currQty = productInventory.getSparklingWaterQty();
			productInventory.setSparklingWaterQty(currQty-1);
			currencyInventory.addCoins(0, 0, 0, 1);
			remainingChange = price - 25;
			
		}
		else if(price >= 45 && productName.equalsIgnoreCase("SparklingSoda") && productInventory.getSparksodaQty()>0 && currencyInventory.getTotalValue() >= price-45) {
			
			int currQty = productInventory.getSparksodaQty();
			productInventory.setSparksodaQty(currQty-1);
			currencyInventory.addCoins(0, 0, 2, 1);
			remainingChange = price - 45;
			
		}
		else if(price >= 35 && productName.equalsIgnoreCase("SparklingPasta") && productInventory.getSparkPastaQty()>0 && currencyInventory.getTotalValue() >= price-35) {
			
			int currQty = productInventory.getSparkPastaQty();
			productInventory.setSparkPastaQty(currQty-1);
			currencyInventory.addCoins(0, 0, 1, 1);
			remainingChange = price - 35;
		}
			
		return remainingChange;
	}
	

}
