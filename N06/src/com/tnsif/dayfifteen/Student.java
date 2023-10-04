//Program to define implementable class of Comparable interface
package com.tnsif.dayfifteen;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private float per;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}


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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		//return name.compareTo(o.name);
		//return (int) (per-o.per);
		return o.rollNo-rollNo;
	}

	
	
	
}
