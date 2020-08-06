package com.customer.gateway;

import com.product.domain.Product;

public interface ProductGateway {

	Product getProductDetail(Long prodId);
}
