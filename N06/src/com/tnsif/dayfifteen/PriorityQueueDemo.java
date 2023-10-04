package com.tnsif.dayfifteen;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(45);
		queue.add(15);
		queue.add(25);
				
		System.out.println("Element to be remove first : "+queue.peek());
				
		System.out.println(queue.remove()+" removed");
		System.out.println("-----------------------");
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}	
	}

}
