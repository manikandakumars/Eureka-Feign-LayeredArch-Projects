package com.customer.gateway.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.gateway.ProductGateway;
import com.product.api.ProductClient;
import com.product.domain.Product;

@Component
public class ProductGatewayImpl implements ProductGateway{

	@Autowired
	ProductClient productClient;
	
	public Product getProductDetail(Long prodId) {
		return productClient.getProductDetail(prodId);
	}

}
