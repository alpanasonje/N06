//Program to define methods for Business logic 
package com.tnsif.businesslogic;

public class Operations {
	//function to get factorial of given number
	public static long getFactorial(int no)
	{
		long fact=1;
		if (no>=0)
		{
			for(int i=1;i<=no;i++)
				fact=fact*i;
			return fact;
		}
		else
			return -1;
	}
	
	public static boolean isPrime(int no)
	{
		for(int i=2;i<no;i++)
		{
			if (no%i==0)
				return false;
		}
		return true;
	}
	public static boolean isStringPalindrome(String s)
	{
		String rev=new StringBuffer(s).reverse().toString();
		if (s.equals(rev))
			return true;
		else
			return false;
	}
	
	public static boolean isNumberPalindrome(int no)
	{
		int rev=0;
		int no1=no;
		while(no!=0)
		{
			rev=rev*10+no%10;
			no=no/10;
		}
		if (rev==no1)
			return true;
		else
			return false;					
	}
	
	public static String getName()
	{
		//return "Manoj";
		return null;
	}
	public static void performDivision(int a,int b) throws ArithmeticException
	{
		System.out.println("Division is "+a/b);
	}
	
	public static int addition(int a, int b)
	{
		return a+b;
	}
}

