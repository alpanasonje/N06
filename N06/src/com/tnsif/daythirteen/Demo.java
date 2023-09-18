package com.tnsif.daythirteen;

public class Demo {
	public static void main(String[] args) {
		System.out.println("In main " + Thread.currentThread());
		ChildThreadOne t1 = new ChildThreadOne();
	//	t1.setPriority(20); IllegalArgumentException
		// converts application into single threaded
		//t1.run();
		
	//	t1.start();
	//	t1.start(); // IllegalThreadStateException
		ChildThreadTwo t2 = new ChildThreadTwo();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("---------------------------------");

	}

}
