package com.product.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.domain.Product;
import com.product.service.IProductService;





@RestController
@RequestMapping("/product")
public class ProductControllerImpl {
	@Autowired
	IProductService productService;
	
	@GetMapping(path = "/product",produces = "application/json")
	public Product getProductDetail(@RequestParam("id") Long custId) {
		return productService.getProductDetail(custId);
	}
	
	@GetMapping(path = "/productandcustomer",produces = "application/json")
	public Product getProductAndCustomerDetail(@RequestParam("cid") Long cId,@RequestParam("pid") Long pId) {
		return productService.getProductAndCustomerDetail(cId,pId);
	}
	
	@GetMapping(path="/hi",produces = "application/json")
	public String greet() {
		return "Hello!";
	}
}
