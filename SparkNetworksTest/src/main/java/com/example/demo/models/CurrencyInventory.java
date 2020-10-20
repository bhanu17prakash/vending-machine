package com.example.demo.models;

public class CurrencyInventory {
	
	private int coinOneQty;
	private int coinFiveQty;
	private int coinTenQty;
	private int coinTwentyFiveQty;
	
	private int totalValue;
	
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int val) {
		this.totalValue = val;
	}
	
	public int getCoinOneQty() {
		return coinOneQty;
	}
	public void setCoinOneQty(int coinOneQty) {
		this.coinOneQty = coinOneQty;
	}
	public int getCoinFiveQty() {
		return coinFiveQty;
	}
	public void setCoinFiveQty(int coinFiveQty) {
		this.coinFiveQty = coinFiveQty;
	}
	public int getCoinTenQty() {
		return coinTenQty;
	}
	public void setCoinTenQty(int coinTenQty) {
		this.coinTenQty = coinTenQty;
	}
	public int getCoinTwentyFiveQty() {
		return coinTwentyFiveQty;
	}
	public void setCoinTwentyFiveQty(int coinTwentyFiveQty) {
		this.coinTwentyFiveQty = coinTwentyFiveQty;
	}
	public CurrencyInventory(int coinOneQty, int coinFiveQty, int coinTenQty, int coinTwentyFiveQty) {
		super();
		this.coinOneQty = coinOneQty;
		this.coinFiveQty = coinFiveQty;
		this.coinTenQty = coinTenQty;
		this.coinTwentyFiveQty = coinTwentyFiveQty;
		this.setTotalValue(this.calculateValue());
	}
	public CurrencyInventory() {
		super();
	}
	
	public void addCoins(int coinOne, int coinFive, int coinTen, int coinTwentyFive ) {
		
		this.coinOneQty += coinOne;
		this.coinFiveQty += coinFive;
		this.coinTenQty += coinTen;
		this.coinTwentyFiveQty += coinTwentyFive;
		this.setTotalValue(this.calculateValue());
		
	}
	
	public int calculateValue() {
		
		return this.coinOneQty*1 + this.coinFiveQty*5 + this.coinTenQty*10 + this.coinTwentyFiveQty*25;
	}
	

}
