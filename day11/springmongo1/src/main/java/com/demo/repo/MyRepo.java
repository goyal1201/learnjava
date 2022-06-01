package com.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Customer;

@Repository
public interface MyRepo extends MongoRepository<Customer, Long>{

}
