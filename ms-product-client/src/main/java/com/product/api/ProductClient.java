package com.product.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.domain.Product;

@FeignClient(name = "MS-PRODUCT")
public interface ProductClient {

	@GetMapping(path = "/product/product",produces = "application/json")
	public Product getProductDetail(@RequestParam("id") Long custId);
}
