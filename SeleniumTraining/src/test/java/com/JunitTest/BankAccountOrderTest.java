package com.JunitTest;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.junit.BankAccount;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderTest {
	
	static BankAccount ba = new BankAccount(0, 0);
	
	@Test
	@Order(2)
	public void testWithdraw()
	{
		ba.withdraw(300);
		assertEquals(200, ba.getBalance(),0);
	}
	

	@Test
	@Order(1)
	public void testDeposit()
	{
		ba.deposite(500);
		assertEquals(500, ba.getBalance(),0);
	}

}
