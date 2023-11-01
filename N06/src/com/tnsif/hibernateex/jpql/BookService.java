package com.tnsif.hibernateex.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tnsif.jpaintro.JPAIUtil;

public class BookService {
	EntityManager em;
	TypedQuery<Book> tquery;
	
	public BookService()
	{
		em=JPAIUtil.getEntityManager();
	}
	
	//Insert records into Book
	public void addBook(Book bookObj)
	{
		em.getTransaction().begin();
		em.persist(bookObj);
		em.getTransaction().commit();
	}
	
	//Retrieve all books
	public List<Book> getAllBooks()
	{
		List<Book> bookList=null;
		String jpql="SELECT bookObj FROM Book bookObj";
		tquery=em.createQuery(jpql, Book.class);
		bookList=tquery.getResultList();
		return bookList; 
	}

	//Retrieve all books
		public List<Book> getAllBooksUsingNamedQuery()
		{
			List<Book> bookList=null;
			Query query=em.createNamedQuery("getBooks");
			bookList=query.getResultList();
			return bookList; 
		}
	//retrieve all books whose price >=given value
	public List<Book> getAllBooksBasedOnPrice(Double value)
	{
		List<Book> bookList=null;
		String jpql="SELECT bookObj FROM Book bookObj WHERE bookObj.price>=:pprice";
		tquery=em.createQuery(jpql, Book.class);
		tquery.setParameter("pprice", value);
		bookList=tquery.getResultList();
		return bookList;
	}
}
