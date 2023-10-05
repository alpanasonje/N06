package com.tnsif.daysixteen;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//sorted set
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Neha");
		ts.add("Sneha");
		ts.add("Pratik");
		ts.add("Snehal");
		ts.add("Nehal");
		//ts.add(null);
		System.out.println(ts);
		
		Comparator<Customer> comp=(c2,c1)->{
			return c1.getName().compareTo(c2.getName());
		};
		TreeSet<Customer> customerSet=new TreeSet<Customer>(comp);
		customerSet.add(new Customer("Pratiksha", "Pune"));
		customerSet.add(new Customer("Nihal", "Pune"));
		customerSet.add(new Customer("Karthik", "Mumbai"));
		customerSet.add(new Customer("Namira", "Nashik"));
		System.out.println(customerSet);
		
		

	}

}
