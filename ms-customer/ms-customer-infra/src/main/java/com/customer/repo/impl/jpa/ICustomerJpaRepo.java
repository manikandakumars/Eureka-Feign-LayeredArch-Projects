package com.customer.repo.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.CustomerEntity;

public interface ICustomerJpaRepo extends JpaRepository<CustomerEntity, Long> {

}
