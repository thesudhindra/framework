package com.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.*;

public class codeTest { 
	@Test
	public void testSayHello()
	{
		code cd = new code();
		assertEquals("Hello World", cd.sayHello());
	}

}
