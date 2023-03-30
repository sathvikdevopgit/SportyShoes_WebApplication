package com.simplilearn.webapp.model;



import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity

@Table(name="product")
public class Product implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productName;
	private int productPrice;
	private String productDiscription;
	
	
	public Product() {
		super();
	}


	public Product(String productName, int productPrice, String productDiscription) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscription = productDiscription;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductDiscription() {
		return productDiscription;
	}


	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}


	@Override
	public String toString() {
		return String.format("Product [productId=%s, productName=%s, productprice=%s, productDiscription=%s]",
				productId, productName, productPrice, productDiscription);
	}


	
	
	
}