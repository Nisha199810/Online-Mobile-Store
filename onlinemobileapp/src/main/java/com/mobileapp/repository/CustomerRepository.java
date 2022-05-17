package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileapp.entity.Customer;

@Repository // @Component
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
