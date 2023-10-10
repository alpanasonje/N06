package com.tnsif.dayeighteen;

import com.tnsif.dayseventeen.Student;

public class Executor {

	public static void main(String[] args) {
	Integer a[]= {10,50,30};
	String str[]={"Python", "C++", "Java", "C"};
	Float prices[]= {56.70f,54f, 78.50f};

	ArrayOperations.display(a);
	ArrayOperations.display(str);
	ArrayOperations.display(prices);
	
	Student st[]=new Student[] {new Student(20, "Neha", 77),new Student(10,"Pooja", 67),new Student(15,"Ajay",81),new Student(5, "Priti", 72)};
	ArrayOperations.display(st);
	
	
	ArrayOperations.sortArray(a);
	ArrayOperations.display(a);
	//ArrayOperations.sortArray(str);
	ArrayOperations.display(str);
	ArrayOperations.sortArray(prices);
	ArrayOperations.display(prices);
	//ArrayOperations.sortArray(st);
	ArrayOperations.display(st);
	}

}
