package com.tnsif.daythirteen;

public class Executor {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Is "+Thread.currentThread().getName()+" is alive? "+Thread.currentThread().isAlive());
		
		ChildThread threadOne=new ChildThread();
		ChildThread threadTwo=new ChildThread();
		System.out.println("Is "+threadOne.getName()+" is alive? "+threadOne.isAlive());
		System.out.println("Is "+threadTwo.getName()+" is alive? "+threadTwo.isAlive());
		threadOne.join();
		threadTwo.join();
		System.out.println("Is "+threadOne.getName()+" is alive? "+threadOne.isAlive());
		System.out.println("Is "+threadTwo.getName()+" is alive? "+threadTwo.isAlive());
		System.out.println("------------------------------");

	}

}
