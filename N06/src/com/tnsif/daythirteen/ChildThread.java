package com.tnsif.daythirteen;

public class ChildThread extends Thread{
	public ChildThread()
	{
		setPriority(MAX_PRIORITY);
		//start thread execution
		start();
	}
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" : Hello");
		System.out.println("Is "+Thread.currentThread().getName()+" is alive? "+Thread.currentThread().isAlive());
	}
}
