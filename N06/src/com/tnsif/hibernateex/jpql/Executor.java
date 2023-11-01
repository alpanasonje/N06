package com.tnsif.hibernateex.jpql;

import java.util.List;

public class Executor {

	public static void main(String[] args) {
		BookService service= new BookService();
		
		Book obj;
		obj=new Book(100l, "Let Us C", "Y Kanetkar", 450.00);
		//service.addBook(obj);
		
		obj=new Book(200l, "Programming with C++", "Balagurusamy", 650.00);
		//service.addBook(obj);
		
		obj=new Book(300l, "SQL and PL/SQL", "Ivan Bayross", 1450.00);
		//service.addBook(obj);
		
		List<Book> bookList;
		System.out.println("--------Display All Books--------");
		//bookList=service.getAllBooks();
		bookList=service.getAllBooksUsingNamedQuery();
		System.out.println(bookList);
		
		System.out.println("--------Display All Books whose price >=500");
		bookList=service.getAllBooksBasedOnPrice(500.00);
		System.out.println(bookList);
		
		System.out.println("--------Display All Books whose price >=1500");
		bookList=service.getAllBooksBasedOnPrice(1500.00);
		System.out.println(bookList.isEmpty()?"No such book available":bookList);
		

	}

}
