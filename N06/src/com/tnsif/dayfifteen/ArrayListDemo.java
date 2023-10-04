//Program to demonstrate Homogeneous List
package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList=new ArrayList<Integer>();
		System.out.println("Size : "+intList.size());
		
		intList.add(10);
		intList.add(41);
		intList.add(81);
		intList.add(30);
		intList.add(7);
		intList.add(80);
		//intList.add("Hello"); CTE
		System.out.println(intList);
		
		//Insert 70 at 2 position
		intList.add(2, 70);
		System.out.println(intList);
		
		System.out.println("Size : "+intList.size());
		
		System.out.println("Is 50 present? "+intList.contains(50));
		
		System.out.println("40 is present at : "+intList.indexOf(40));
		System.out.println("400 is present at : "+intList.indexOf(400));
		
		System.out.println("element at 4 position is removed "+intList.remove(4));
		
		System.out.println(intList);
		
		//IndexOutOfBoundsException
		//intList.remove(7);
		System.out.println("Removed "+intList.remove(intList.indexOf(7)));
		System.out.println(intList);
		
		//Iterate the list
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+" is "+(no%2==0?"Even":"Odd"));
		}
				
		Collections.sort(intList);
			
		System.out.println("-----After Sorting-----");
		System.out.println(intList);
		
		Collections.reverse(intList);
		System.out.println("-----After Reversing-----");
		System.out.println(intList);
		
		intList.clear();
		System.out.println("Is list empty?: "+intList.isEmpty());
		
		List<String> nameList=new ArrayList<String>();
		nameList.add("Pooja");
		nameList.add("Neha");
		nameList.add("Pratik");
		nameList.add("Sanket");
		
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
	}
}
