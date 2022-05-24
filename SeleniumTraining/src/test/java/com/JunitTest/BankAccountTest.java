package com.JunitTest;

import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Duration;
import java.util.Objects;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.junit.BankAccount;
@DisplayName("Test Bank account class")
public class BankAccountTest {
	
	@Test
	@DisplayName("Withdraw 500 successfully")//junit jupiter annotation
	public void withdrawTest()
	{
		BankAccount ba = new BankAccount(2000,1000);
		ba.withdraw(500);
		assertEquals(1500, ba.getBalance(),0);
		ba.deposite(700);
		assertEquals(2200, ba.getBalance(),0);
	}
	@Test
	@DisplayName("Deposited 500 successfully")
	public void test_deposite()
	{
		BankAccount ba = new BankAccount(2000, 1000);
		ba.deposite(500);
		assertEquals(2500, ba.getBalance(),0);
	}
	@Test
	public void testWithdrwNotstuckAtZero()
	{
		BankAccount ba = new BankAccount(500, -1000);
		ba.withdraw(800);
		assertNotEquals(0, ba.getBalance()); 
	
	}
	@Test
	public void testActive()
	{
		BankAccount ba = new BankAccount(500, 0);
		assumeFalse(Objects.isNull(ba));
		assumingThat(false,()-> assertTrue("Bank account is active", ba.isActive()));
		
		
	}
	
	@Test
	public void testHoldername()
	{
		BankAccount ba = new BankAccount(500, 0);
		ba.setHolderName("Sudhindra");
		assertNotNull(ba.getHolderName());
	}
	@Test
	public void testDepositTimeOut()
	{
		BankAccount ba = new BankAccount(400, 0);
		assertTimeout(Duration.ofNanos(1), () ->ba.deposite(200));
	}
	
}
