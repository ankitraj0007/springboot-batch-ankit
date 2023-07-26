package com.learnwithankit.springbootbatchankit.repository;

import com.learnwithankit.springbootbatchankit.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
