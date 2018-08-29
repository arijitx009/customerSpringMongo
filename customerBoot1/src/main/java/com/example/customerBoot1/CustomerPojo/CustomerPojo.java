package com.example.customerBoot1.CustomerPojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class CustomerPojo {

	@Id
	private ObjectId _id;
	
	public ObjectId get_id() {
		return _id;
	}



	public void set_id(ObjectId _id) {
		this._id = _id;
	}



	private int customerId;
	private String customerName;
	private String emailId;
	private String address;

public CustomerPojo() {}
		
	
	
	public CustomerPojo(int customerId, String customerName, String emailId, String address) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
		this.address = address;
	}



public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}



@Override
public String toString() {
	return "CustomerPojo [_id=" + _id + ", customerId=" + customerId + ", customerName=" + customerName + ", emailId="
			+ emailId + ", address=" + address + "]";
}



	

}
