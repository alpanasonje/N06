package com.tnsif.daythirteen;

public class Student
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
