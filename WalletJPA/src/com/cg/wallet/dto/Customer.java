package com.cg.wallet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Column
	private String cusName;
	
	@Id
	@Column(name="mobile_no")
	private String cusMobileNo;
	
	@Column
	private float cusAge;
	
	@Column(name="init_bal")
	private double cusInitialBalance;
	
	public Customer() {
		super();
	}

	public Customer(String name, String mobileNo, float age,
			double initialBalance) {
		super();
		this.cusName = name;
		this.cusMobileNo = mobileNo;
		this.cusAge = age;
		this.cusInitialBalance = initialBalance;
	}

	public String getName() {
		return cusName;
	}

	public void setName(String name) {
		this.cusName = name;
	}

	public String getMobileNo() {
		return cusMobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.cusMobileNo = mobileNo;
	}

	public float getAge() {
		return cusAge;
	}

	public void setAge(float age) {
		this.cusAge = age;
	}

	public double getInitialBalance() {
		return cusInitialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.cusInitialBalance = initialBalance;
	}	
	
	
}
