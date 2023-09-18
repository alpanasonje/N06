package com.tnsif.daythirteen;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+"Hello");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
