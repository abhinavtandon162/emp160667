package com.cg.wallet.service;

import com.cg.wallet.exception.BankAccountException;
import com.cg.wallet.dto.Customer;



public interface BankAccountService {
	
	
public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	
	public boolean validateAccount(String mobileNo) throws BankAccountException;
	
	public boolean validateName(String name) throws BankAccountException;
	
	public boolean validateAge(float age) throws BankAccountException;
	
	public boolean validateMoileNo(String mobileNo) throws BankAccountException;
	
	public boolean validateAmount(double amount) throws BankAccountException;
			
	public void getTransactionList(String mobileNo);

}
