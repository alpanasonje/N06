package com.tnsif.daythirteen;
class Student
{
	int rollNo;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return rollNo+"\t"+name;
	}
}

public class ThreadDemo {
   
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		System.out.println("-------------------------");
		Student st=new Student();
		st.setRollNo(10);
		st.setName("Pooja");
		System.out.println(st);
		
	//	Object
		
	}
	

}
