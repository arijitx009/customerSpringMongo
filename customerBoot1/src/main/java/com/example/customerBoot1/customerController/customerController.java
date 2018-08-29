package com.example.customerBoot1.customerController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
//import org.springframework.boot.actuate.endpoint.web.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import com.example.customerBoot1.CustomerPojo.CustomerPojo;

import com.example.customerBoot1.customerService.customerService;

@RestController
public class customerController {
	
	@Autowired
	private customerService cs;
	
	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping("/customer/{start}/{count}")
	public Resources getCustomerByPage(@PathVariable int start,@PathVariable int count) 
	{
		List<CustomerPojo> tempCustomer=cs.getAllNames();
		List<CustomerPojo> customer=new ArrayList<CustomerPojo>();
		
		for(int i=start;i<start+count;i++)
		{
			customer.add(tempCustomer.get(i-1));
		}
	Link nextLink= linkTo(methodOn(this.getClass()).getCustomerByPage(start+count,count)).withRel("nextLink");
	
	
	Link previousLink= linkTo(methodOn(this.getClass()).getCustomerByPage(start-count>=0?start-count:1,count)).withRel("previousLink");
	
	
	@SuppressWarnings("unchecked")
	Resources resources=new Resources(customer,nextLink,previousLink);
	
	return resources;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/customer")
	public List<CustomerPojo> getAllNames() 
	{
		return cs.getAllNames();
	}
	@RequestMapping("/customer/{id}")
	public Resource getCustomer( @PathVariable int id) 
	{
		Link nextLink= linkTo(methodOn(this.getClass()).getAllNames()).withRel("viewAll");
		
		Resource resource=new Resource(cs.getCustomer(id),nextLink);
		
		
		
		return resource;
	}
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public void addCustomer(@RequestBody CustomerPojo cp)
	{
		cs.addCustomer(cp);
	}
	
	@RequestMapping(value="/customer/{id}",method=RequestMethod.PUT)
	
		public void updateCustomer(@PathVariable int id,@RequestBody CustomerPojo cp)
		{
			cs.updateCustomer(id, cp);
		}
	@RequestMapping(value="/customer/{id}",method=RequestMethod.DELETE)
	
	public void deleteCustomer(@PathVariable int id) 
	{
		cs.deleteCustomer(id);
	}
	
	}
	


