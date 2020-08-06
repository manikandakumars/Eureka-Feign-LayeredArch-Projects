package com.customer.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.domain.Customer;
import com.customer.service.ICustomerService;
import com.product.domain.Product;

@RestController
@RequestMapping("/customer")
public class CustomerControllerImpl {
	@Autowired
	ICustomerService customerService;
	
	@GetMapping(path = "/customer",produces = "application/json")
	public Customer getCusomerDetail(@RequestParam("id") Long custId) {
		return customerService.getCusomerDetail(custId);
	}
	
	@GetMapping(path="/hi",produces = "application/json")
	public String greet() {
		return "Hello!";
	}
	
	@GetMapping(path = "/customerandproduct",produces = "application/json")
	public Customer getCustomerAndProductDetail(@RequestParam("cid") Long cId,@RequestParam("pid") Long pId) {
		return customerService.getCustomerAndProductDetail(cId,pId);
	}
}
