package com.product.repo.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.domain.Product;
import com.product.entity.ProductEntity;
import com.product.repo.IProductRepo;
import com.product.repo.impl.jpa.IProductJpaRepo;
@Repository
public class ProductRepoImpl implements IProductRepo {

	@Autowired
	IProductJpaRepo productJpaRepo;

	public Product getProductDetail(Long custId) {
		Optional<ProductEntity> productEntity = productJpaRepo.findById(custId);
		return convertEntityToDomain(productEntity);
	}

	private Product convertEntityToDomain(Optional<ProductEntity> pe) {
		Product product  =null;
		if(pe.isPresent()) {
			product = new Product();
			product.setProductId(pe.get().getProductId());
			product.setProductName(pe.get().getProductName());
			product.setPrice(pe.get().getPrice());
		}
		return product;
	}
}
