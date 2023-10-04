//Program to demonstrate ArrayList with user defined objects
package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserDefinedListDemo {

	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		studentList.add(new Student(1,"Ankush",67));
		studentList.add(new Student(2,"Ritesh",71));
		studentList.add(new Student(3,"Mahesh",56));
		studentList.add(new Student(4,"Suresh",63));
		studentList.add(new Student(5,"Piyush",73));
		
		System.out.println(studentList);
		
		//Using implementable class of Comparable interface
		Collections.sort(studentList);
		System.out.println("After Sorting "+studentList);
		
		
		ArrayList<Stud> studList=new ArrayList<Stud>();
		
		studList.add(new Stud(1,"Ankush",67));
		studList.add(new Stud(2,"Ritesh",71));
		studList.add(new Stud(3,"Mahesh",56));
		studList.add(new Stud(4,"Suresh",63));
		studList.add(new Stud(5,"Piyush",73));
		System.out.println(studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList,new SortByName());
		System.out.println("After Sorting on Name\n"+studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList,new SortByPer());
		System.out.println("After Sorting on Per\n"+studList);
		
		//Lambda Expression
		Comparator<Stud> comp=(s2,s1)->{return s1.getName().compareTo(s2.getName());};
		Collections.sort(studList,comp);
		System.out.println("After Sorting on Descending order of Name\n"+studList);
	}

}
