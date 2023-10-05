package com.tnsif.daysixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Ordered Set
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(40);
		lhs.add(20);
		lhs.add(90);
		lhs.add(70);
		lhs.add(50);
		System.out.println(lhs);
		
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Collections.sort(lhs);
		ArrayList<Integer> numList=new ArrayList<Integer>(lhs);
		Collections.sort(numList);
		System.out.println(numList);
		
		System.out.println("-----------------------------");
		
		LinkedHashSet<Customer> customerSet=new LinkedHashSet<Customer>();
		customerSet.add(new Customer("Pratiksha", "Pune"));
		customerSet.add(new Customer("Nihal", "Pune"));
		customerSet.add(new Customer("Karthik", "Mumbai"));
		customerSet.add(new Customer("Namira", "Nashik"));
		//customerSet.add(null);
		System.out.println(customerSet);
		System.out.println("-----------------------------");
		ArrayList<Customer> customerList=new ArrayList<Customer>(customerSet);
		
		System.out.println(customerList);
		Comparator<Customer> comp=(c1,c2)->{
			return c1.getCity().compareTo(c2.getCity());
		};
		Collections.sort(customerList,comp);
		System.out.println(customerList);
	}

}
