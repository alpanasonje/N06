package com.tnsif.dayfifteen;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private float salary;
	private String designation;

	public Employee() {
	}
	public Employee(int empId, String empName, float salary, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		//sort based on salary	
		return (int) (getSalary()-o.getSalary());
		
		//sort on descending order of name
		//return o.getEmpName().compareTo(getEmpName());
		
	}

}
