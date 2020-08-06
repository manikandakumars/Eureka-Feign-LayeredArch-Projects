package com.customer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.domain.Customer;

@FeignClient(name = "MS-CUSTOMER")
public interface CustomerClient {

	@GetMapping(path = "/customer/customer",produces = "application/json")
	public Customer getCusomerDetail(@RequestParam("id") Long id);
	
}
