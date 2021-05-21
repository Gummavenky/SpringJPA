package com.gummaTech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gummaTech.entity.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
