package com.example.customerBoot1.CustomerDao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.customerBoot1.CustomerPojo.CustomerPojo;

public interface CustomerDao extends MongoRepository<CustomerPojo,Integer> {
	
	public CustomerPojo findByCustomerId(int customerId);
	public void deleteByCustomerId(int customerId);

}
