package com.tnsif.dayfifteen;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.add(5);
		queue.add(45);
		queue.add(15);
		queue.add(25);
		
		System.out.println("First Element : "+queue.getFirst());
		System.out.println("Last Element : "+queue.getLast());
		System.out.println("Element to be remove first : "+queue.peekFirst());
		System.out.println("Element to be remove last : "+queue.peekLast());
		System.out.println(queue.remove()+" removed");
		System.out.println("-----------------------");
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}	
	}

}
