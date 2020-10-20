package com.example.demo.models;

public class ProductInventory {
	
	
	private int sparklingWaterQty;
	private int sparkPastaQty;
	private int sparksodaQty;
	
	public ProductInventory() {
		super();
	}

	public ProductInventory(int sparklingWaterQty, int sparkPastaQty, int sparksodaQty) {
		super();
		this.sparklingWaterQty = sparklingWaterQty;
		this.sparkPastaQty = sparkPastaQty;
		this.sparksodaQty = sparksodaQty;
	}

	public int getSparklingWaterQty() {
		return sparklingWaterQty;
	}

	public void setSparklingWaterQty(int sparklingWaterQty) {
		this.sparklingWaterQty = sparklingWaterQty;
	}

	public int getSparkPastaQty() {
		return sparkPastaQty;
	}

	public void setSparkPastaQty(int sparkPastaQty) {
		this.sparkPastaQty = sparkPastaQty;
	}

	public int getSparksodaQty() {
		return sparksodaQty;
	}

	public void setSparksodaQty(int sparksodaQty) {
		this.sparksodaQty = sparksodaQty;
	}

	public void addProduct(int sparklingWaterQty, int sparkPastaQty, int sparksodaQty ) {
		this.sparklingWaterQty += sparklingWaterQty;
		this.sparkPastaQty += sparkPastaQty;
		this.sparksodaQty += sparksodaQty;
		
		
	}
	

}
