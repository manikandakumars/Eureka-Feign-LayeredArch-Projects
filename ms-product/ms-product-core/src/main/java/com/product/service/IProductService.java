package com.product.service;

import com.product.domain.Product;

public interface IProductService {

	Product getProductDetail(Long custId);
	Product getProductAndCustomerDetail(Long cId,Long pId);
}
