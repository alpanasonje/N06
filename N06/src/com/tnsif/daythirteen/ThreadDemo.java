//Program to demonstrate Multithreading
package com.tnsif.daythirteen;

public class ThreadDemo {
   
	public static void main(String[] args) {
		//accessing background thread(main)
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		System.out.println("-------------------------");
		
		
	}
	

}
