package com.tnsif.hibernateex.onetomanybi;

import java.util.HashSet;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		
	EntityManager em=JPAIUtil.getEntityManager();
	
	Department deptObjOne=new Department();
	deptObjOne.setId(10);
	deptObjOne.setName("Account");
		
	Department deptObjTwo=new Department();
	deptObjTwo.setId(20);
	deptObjTwo.setName("Sales");
	
	
	Department deptObjThree=new Department();
	deptObjThree.setId(30);
	deptObjThree.setName("IT");
	
	Employee empObjOne=new Employee();
	empObjOne.setId(1);
	empObjOne.setName("Jeevan");
	empObjOne.setDepartment(deptObjOne);
	
	Employee empObjTwo=new Employee();
	empObjTwo.setId(2);
	empObjTwo.setName("Tanay");
	empObjTwo.setDepartment(deptObjTwo);
	
	Employee empObjThree=new Employee();
	empObjThree.setId(3);
	empObjThree.setName("Akash");
	empObjThree.setDepartment(deptObjTwo);
	
	Employee empObjFour=new Employee();
	empObjFour.setId(4);
	empObjFour.setName("Monali");
	empObjFour.setDepartment(deptObjThree);
	
	HashSet<Employee> empSet=new HashSet<Employee>();
	empSet.add(empObjOne);
	deptObjOne.setEmployees(empSet);
	
	empSet.clear();
	empSet.add(empObjTwo);
	empSet.add(empObjThree);
	deptObjTwo.setEmployees(empSet);
	
	empSet.clear();
	empSet.add(empObjFour);
	deptObjThree.setEmployees(empSet);
	
	em.getTransaction().begin();
	em.persist(deptObjOne);
	em.persist(deptObjTwo);
	em.persist(deptObjThree);
	em.persist(empObjOne);
	em.persist(empObjTwo);
	em.persist(empObjThree);
	em.persist(empObjFour);
	em.getTransaction().commit();
	}

}
