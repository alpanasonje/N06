package com.tnsif.dayfifteen;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> numberList=new LinkedList<Integer>();
		numberList.add(12);
		numberList.add(87);
		numberList.add(26);
		numberList.add(49);
		
		System.out.println(numberList);
		Collections.sort(numberList);
		System.out.println("After Sorting "+numberList);
		numberList.addFirst(50);
		numberList.addLast(33);
		
		System.out.println(numberList);
		System.out.println("First Element : "+numberList.getFirst());
		System.out.println("Last Element : "+numberList.getLast());
		
		numberList.removeFirst();
		numberList.removeLast();
		System.out.println(numberList);
		
		//Iterator
		//Iterate only forward directions and we can remove current element 
		Iterator<Integer> it=numberList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		//	it.remove();
		}
		
		System.out.println(numberList);
		
		//ListIterator - Traverse in Both directions and allow to 
		//add new element, remove current element and modify current element
		ListIterator<Integer> listIt=numberList.listIterator();
		while(listIt.hasNext()) //Forward Direction
		{
			System.out.println(listIt.next());
		}
		System.out.println("-----------------------");
		while(listIt.hasPrevious())//Backward Direction
		{
			System.out.println(listIt.previous());
		}
		
		System.out.println("-----------------------");
		listIt=numberList.listIterator(numberList.size()); //at last position
		
		while(listIt.hasPrevious()) //Backward direction
		{
			int no=listIt.previous();
			System.out.println(no);
			if (no==87)
				listIt.add(100);
			if (no==26)
				listIt.set(126);
			if (no==49)
				listIt.remove();
		}
		System.out.println("-----------------------");
		System.out.println(numberList);
		
	}
	

}
