package com.tnsif.dayeighteen;

import java.util.Arrays;
import java.util.List;

import com.tnsif.dayfifteen.Employee;
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
	
	System.out.println("--------------------------");
	Integer val=10;
	Float f=20f;
	GenericConstructors obj=new GenericConstructors(val);
	obj.show();
	
	obj=new GenericConstructors(f);
	obj.show();
	
	System.out.println("--------------------------");
	MinMaxImpl<Integer> intObj=new MinMaxImpl<Integer>(a);
	System.out.println("Minimum of Int array is : "+intObj.getMinimum());
	System.out.println("Maximum of Int array is : "+intObj.getMaximum());
	
	
	MinMaxImpl<String> strObj=new MinMaxImpl<String>(str);
	System.out.println("Minimum of String array is : "+strObj.getMinimum());
	System.out.println("Maximum of String array is : "+strObj.getMaximum());
	
	MinMaxImpl<Float> floatObj=new MinMaxImpl<Float>(prices);
	System.out.println("Minimum of Float array is : "+floatObj.getMinimum());
	System.out.println("Maximum of Float array is : "+floatObj.getMaximum());
	
	Employee emp[]=new Employee[] {new Employee(2000, "Meet", 67000, "Jr. Software Developer"), new Employee(4000, "Pankaj", 45000, "Accountant"), new Employee(1000, "Prakash", 120000, "Manager")};
	
	MinMaxImpl<Employee> empObj=new MinMaxImpl<Employee>(emp);
	System.out.println("Minimum of Employee array is : "+empObj.getMinimum());
	System.out.println("Maximum of Employee array is : "+empObj.getMaximum());
	
	
	System.out.println("--------------------------");
	
	List<Integer> intList=Arrays.asList(a);
	LowerBoundedWildCard objOne=new LowerBoundedWildCard();
	objOne.displayNumbers(intList);
	
	
	List<String> strList=Arrays.asList(str);
	//objOne.displayNumbers(strList);
	
	List<Float> floatList=Arrays.asList(prices);
//	objOne.displayNumbers(floatList);
	
	Byte[] larray= {12,56,77,78};
	List<Byte> longList=Arrays.asList(larray);
//	objOne.displayNumbers(longList);
	
	Number numArray[]= {12.0,77.0,55.0}; 
	List<Number> numList=Arrays.asList(larray);
	objOne.displayNumbers(numList);
	
	UpperBoundedWildCard objTwo=new UpperBoundedWildCard();
	System.out.println(objTwo.sumOfList(numList));
	System.out.println(objTwo.sumOfList(floatList));
	System.out.println(objTwo.sumOfList(intList));
	
	}
	
	
	

}
