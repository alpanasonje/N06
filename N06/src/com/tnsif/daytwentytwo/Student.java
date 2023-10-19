package com.tnsif.daytwentytwo;

public class Student {
	private int rollNo;
	private String studentName;
	private float per;

	public Student(int rollNo, String studentName, float per) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.per = per;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", per=" + per + "]";
	}

}
