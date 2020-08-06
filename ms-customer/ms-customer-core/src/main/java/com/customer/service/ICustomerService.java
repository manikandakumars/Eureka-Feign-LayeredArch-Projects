package com.customer.service;

import com.customer.domain.Customer;

public interface ICustomerService {

	Customer getCusomerDetail(Long custId);
	Customer getCustomerAndProductDetail(Long cId,Long pId);
}
