/*
 * @Product.java	@Jan 28, 2020 
 */
package com.ec2.rds.api.vo;

import java.math.BigDecimal;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
public class Product {
	private String id;
	private String productName;
	private String productDescription;
	private BigDecimal productPrice;

	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
	
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
	
		this.id = id;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {

		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {

		this.productName = productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {

		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {

		this.productDescription = productDescription;
	}

	/**
	 * @return the productPrice
	 */
	public BigDecimal getProductPrice() {

		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(BigDecimal productPrice) {

		this.productPrice = productPrice;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	 * <p>
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public String toString() {

		return "Product [productName=" + productName + ", productDescription=" + productDescription + ", productPrice="
				+ productPrice + "]";
	}



}
