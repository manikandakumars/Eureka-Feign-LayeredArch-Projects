package com.product.repo;

import com.product.domain.Product;

public interface IProductRepo {
	
	Product getProductDetail(Long custId);

}
