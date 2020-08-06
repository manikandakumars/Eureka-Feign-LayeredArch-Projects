package com.product.gateway.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.api.CustomerClient;
import com.customer.domain.Customer;
import com.product.gateway.CustomerGateway;

@Component
public class CustomerGatewayImpl implements CustomerGateway{

	@Autowired
	CustomerClient customerClient;
	public Customer getCustDetails(Long id) {
		return customerClient.getCusomerDetail(id);
	}

}
