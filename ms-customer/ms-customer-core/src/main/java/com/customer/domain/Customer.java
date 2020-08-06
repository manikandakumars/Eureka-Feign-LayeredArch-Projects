package com.customer.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.product.domain.Product;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
	
	private Long customerId;
	private String firstName;
	private String lastName;
	
	private Product product;

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
