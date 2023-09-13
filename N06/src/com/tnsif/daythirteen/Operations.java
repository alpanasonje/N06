package com.tnsif.daythirteen;
public class Operations {
	public static int getFactorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++)
			fact=fact*i;
		System.out.println("In Factorial method : "+Thread.currentThread());
		return fact;
	}
	public static boolean isPrime(int no) {
		boolean flag=true;
		for(int i=2;i<no/2;i++)
		{
			if (no%i==0)
			{
				flag=false;
				break;
			}
		}
		System.out.println("In isPrime method() : "+Thread.currentThread());
		return flag;
	}
}
