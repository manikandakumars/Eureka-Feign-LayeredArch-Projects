package com.customer.repo;

import com.customer.domain.Customer;

public interface ICustomerRepo {
	
	Customer getCusomerDetail(Long custId);

}
