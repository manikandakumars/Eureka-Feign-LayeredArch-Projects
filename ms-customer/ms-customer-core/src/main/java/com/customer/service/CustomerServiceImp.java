package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.domain.Customer;
import com.customer.gateway.ProductGateway;
import com.customer.repo.ICustomerRepo;
import com.product.domain.Product;

@Service
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	ICustomerRepo customerRepo;
	
	@Autowired
	ProductGateway productGateway;
	
	public Customer getCusomerDetail(Long custId) {
		return customerRepo.getCusomerDetail(custId);
	}

	public Customer getCustomerAndProductDetail(Long cId, Long pId) {
		Customer customer=getCusomerDetail(cId);
		
		//Gateway Call
		Product product = productGateway.getProductDetail(pId);
		
		customer.setProduct(product);
		
		return customer;
	}

}
