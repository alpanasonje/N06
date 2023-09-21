//Program to demonstrate inter-thread communication
package com.tnsif.dayfourteen.interthreadcommunication;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//Shared Resource
		Q obj=new Q();
		
		Producer producerThread=new Producer(obj); //Producer thread
		Consumer consumerThread=new Consumer(obj); //Consumer thread
		
		
		  try { producerThread.join(); 
		  consumerThread.join(); } catch (InterruptedException e) {
		  System.out.println(e); }
		 
		System.out.println("---------End of main()----------");	
	}
}






