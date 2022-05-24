package com.salesforce;

public class Test {
	
	  void m1()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Test t1 = (Test)Class.forName("Test").newInstance();
		t1.m1();
		
	}
	


}
