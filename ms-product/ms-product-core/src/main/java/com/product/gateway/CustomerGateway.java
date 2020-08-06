package com.product.gateway;

import com.customer.domain.Customer;

public interface CustomerGateway {
	
	Customer getCustDetails(Long id);

}
