package com.product.repo.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.ProductEntity;

public interface IProductJpaRepo extends JpaRepository<ProductEntity, Long> {

}
