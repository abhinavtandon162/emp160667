package com.cg.wallet.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.wallet.exception.BankAccountException;
import com.cg.wallet.service.BankAccountServiceImpl;

public class TestClassJPA {
	
	static BankAccountServiceImpl service = new BankAccountServiceImpl();
	static Boolean result = null;
	
	@Test
    public void name_C1() throws BankAccountException{
    
        String name="Abhinav";
        result= service.validateName(name);
        Assert.assertEquals(true,result);
    }
	@Test
    public void name_C2() throws BankAccountException{
    
        String name="abhinav";
        result= service.validateName(name);
        Assert.assertEquals(false,result);
    }
	@Test
    public void name_C3() throws BankAccountException{
    
        String name="Abhinav123";
        result= service.validateName(name);
        Assert.assertEquals(false,result);
    }
	@Test
	public void mobileNo_C4() throws BankAccountException
	{
		String mobileNo="9461136968";
		result = service.validateMoileNo(mobileNo);
		Assert.assertEquals(true, result);
	}
	@Test
	public void mobileNo_C5() throws BankAccountException
	{
		String mobileNo="1461136968";
		result = service.validateMoileNo(mobileNo);
		Assert.assertEquals(false, result);
	}
	@Test
	public void mobileNo_C6() throws BankAccountException
	{
		String mobileNo="946113";
		result = service.validateMoileNo(mobileNo);
		Assert.assertEquals(false, result);
	}
	@Test
	public void age_C5() throws BankAccountException
	{
		int age=12;
		result = service.validateAge(age);
		Assert.assertEquals(false, result);
	}
	@Test
	public void amount_C6() throws BankAccountException
	{
		double amount = 556;
		result = service.validateAmount(amount);
		Assert.assertEquals(true, result);
	}
	@Test
	public void amount_C7() throws BankAccountException
	{
		double amount = 556.98564;
		result = service.validateAmount(amount);
		Assert.assertEquals(false, result);
		System.err.println("There Should be upto 4 number after Decimal!");
	}
}
