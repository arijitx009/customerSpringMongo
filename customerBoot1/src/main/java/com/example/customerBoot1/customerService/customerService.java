package com.example.customerBoot1.customerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerBoot1.CustomerDao.CustomerDao;
import com.example.customerBoot1.CustomerPojo.CustomerPojo;

@Service
public class customerService {
	
	
	@Autowired
	private CustomerDao dao;
	
	
			

	
	public List<CustomerPojo> getAllNames() 
	{
		
		
			
		
		return dao.findAll();
	}
	
	public  CustomerPojo getCustomer(int id)
	
	{
		
		
		return dao.findByCustomerId(id);
	}
	public void addCustomer(CustomerPojo cp)
	{
		dao.save(cp);
	}
	public void updateCustomer(int id,CustomerPojo cp)
	{
		dao.save(cp);
	}
	public void deleteCustomer(int id) 
	{
		
		dao.deleteByCustomerId(id);
	}

}
