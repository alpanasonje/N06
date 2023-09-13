package com.tnsif.daythirteen;

public class ChildThreadTwo extends Thread{
	public void run()
	{
		System.out.println(" is 5 Prime number? "+Operations.isPrime(5));
	}
}
