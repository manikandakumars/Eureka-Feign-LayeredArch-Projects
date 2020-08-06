package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.domain.Customer;
import com.product.domain.Product;
import com.product.gateway.CustomerGateway;
import com.product.repo.IProductRepo;


@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	IProductRepo productRepo;
	
	@Autowired
	CustomerGateway customerGateway;
	
	public Product getProductDetail(Long prodId) {
		return productRepo.getProductDetail(prodId);
	}

	public Product getProductAndCustomerDetail(Long cId, Long pId) {
		 
		Product product = getProductDetail(pId);
		
		//Gateway call
		Customer customer = customerGateway.getCustDetails(cId);
		
		product.setCustomer(customer);
		
		return product;
	}

}
