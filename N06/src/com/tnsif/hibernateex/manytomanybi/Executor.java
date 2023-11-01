package com.tnsif.hibernateex.manytomanybi;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		Products pObjOne,
		pObjTwo, pObjThree, pObjFour, pObjFive;
		pObjOne=new Products();
		pObjOne.setId(1);
		pObjOne.setName("Keyboard");
		
		pObjTwo=new Products();
		pObjTwo.setId(2);
		pObjTwo.setName("Mouse");
		
		pObjThree=new Products();
		pObjThree.setId(3);
		pObjThree.setName("Headphone");
		
		pObjFour=new Products();
		pObjFour.setId(4);
		pObjFour.setName("Pendrive");
		
		pObjFive=new Products();
		pObjFive.setId(5);
		pObjFive.setName("Harddrive");
		
		Set<Products> productSetOne= new HashSet<Products>();
		productSetOne.add(pObjOne);
		productSetOne.add(pObjTwo);
		productSetOne.add(pObjThree);
		
		Set<Products> productSetTwo= new HashSet<Products>();
		productSetTwo.add(pObjOne);
		productSetTwo.add(pObjFour);
		productSetTwo.add(pObjFive);
		
		Orders orderArray[]=new Orders[2];
		for (int i=0;i<orderArray.length;i++)
		{
			if (i==0)
				orderArray[i]=new Orders(i+100,new Date(2023,10,21), productSetOne);
			else
				orderArray[i]=new Orders(i+100,new Date(2023,10,25), productSetTwo);
		}
		
		Set<Orders> orderSetOne= new HashSet<Orders>(); 
		Set<Orders> orderSetTwo= new HashSet<Orders>();
		Set<Orders> orderSetThree= new HashSet<Orders>();
		orderSetOne.add(orderArray[0]);
		orderSetOne.add(orderArray[1]);
		
		orderSetTwo.add(orderArray[0]);
		
		orderSetThree.add(orderArray[1]);
		
		pObjOne.setOrders(orderSetOne);
		pObjTwo.setOrders(orderSetTwo);
		pObjThree.setOrders(orderSetTwo);
		pObjFour.setOrders(orderSetThree);
		pObjFive.setOrders(orderSetThree);
		
		EntityManager em=JPAIUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(pObjOne);
		em.persist(pObjTwo);
		em.persist(pObjThree);
		em.persist(pObjFour);
		em.persist(pObjFive);
		em.persist(orderArray[0]);
		em.persist(orderArray[1]);
		em.getTransaction().commit();
		
		
	}

}
