package com.customer.repo.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.domain.Customer;
import com.customer.entity.CustomerEntity;
import com.customer.repo.ICustomerRepo;
import com.customer.repo.impl.jpa.ICustomerJpaRepo;
@Repository
public class CustomerRepoImpl implements ICustomerRepo {

	@Autowired
	ICustomerJpaRepo customerJpaRepo;

	public Customer getCusomerDetail(Long custId) {
		Optional<CustomerEntity> customerEntity = customerJpaRepo.findById(custId);
		return convertEntityToDomain(customerEntity);
	}

	private Customer convertEntityToDomain(Optional<CustomerEntity> ce) {
		Customer customer  =null;
		if(ce.isPresent()) {
			customer = new Customer();
			customer.setCustomerId(ce.get().getCustomerId());
			customer.setFirstName(ce.get().getFirstName());
			customer.setLastName(ce.get().getLastName());
		}
		return customer;
	}
}
