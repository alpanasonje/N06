package com.tnsif.hibernateex.onetoone;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		EntityManager em=JPAIUtil.getEntityManager();
		
		
		  Address addressObj=new Address(); addressObj.setAddressId(101);
		  addressObj.setCity("Nashik"); addressObj.setState("Maharashtra");
		 
		  Address addressObjOne=new Address(); 
		  addressObjOne.setAddressId(201);
		  addressObjOne.setCity("Pune"); 
		  addressObjOne.setState("Maharashtra");
		  
		  Address addressObjTwo=new Address(); 
		  addressObjTwo.setAddressId(301);
		  addressObjTwo.setCity("Surat"); 
		  addressObjTwo.setState("Gujrat");
		 
		  Student studObj=new Student();
		  studObj.setStudentId(1);
		  studObj.setName("Nitin");
		  studObj.setAddress(addressObj);

		  Student studObjOne=new Student();
		  studObjOne.setStudentId(2);
		  studObjOne.setName("Ketan");
		  studObjOne.setAddress(addressObjOne);
		 
		  Student studObjTwo=new Student();
		  studObjTwo.setStudentId(3);
		  studObjTwo.setName("Nikhil");
		  studObjTwo.setAddress(addressObjTwo);
		 
			/*
			 * em.getTransaction().begin(); // em.persist(addressObj);
			 * em.persist(addressObjOne); em.persist(addressObjTwo); // em.persist(studObj);
			 * em.persist(studObjOne); em.persist(studObjTwo); em.getTransaction().commit();
			 */
		  
		  Address addr=em.find(Address.class, 201);
		  System.out.println(addr);
		  addr.setCity("Mumbai");
		  em.getTransaction().begin();
		  em.merge(addr);
		  em.getTransaction().commit();

	}

}
