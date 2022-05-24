package com.junit;

public class BankAccount {
	
	private double balance;
	private double minimumBalance;
	private boolean isActive=true;
	private String holderName;
	
	public BankAccount(double balance, double minimumBalance)
	{
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getminimumBalance()
	{
		return minimumBalance;
	}
	public String getHolderName()
	{
		return holderName;
	}
	public void setHolderName(String holderName)
	{
		this.holderName= holderName;
	}
	
	public boolean isActive()
	{
		return isActive;
	}
	
	public double withdraw(double amount)
	{
		if((balance-amount)>minimumBalance)
		{
			balance -=amount;
		}
		else
		{
			throw new RuntimeException();
		}
		return amount;
	}
	
	public double deposite(double amount)
	{
		return balance += amount; 
	}
	
	

}
