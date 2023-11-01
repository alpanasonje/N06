package com.tnsif.hibernateex.jpql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(
		@NamedQuery(name="getBooks",query= "SELECT bookObj FROM Book bookObj"))
public class Book {
		@Id
		private Long id;
		private String bookTitle;
		private String author;
		private Double price;
		
		
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Book(Long id, String bookTitle, String author, Double price) {
			super();
			this.id = id;
			this.bookTitle = bookTitle;
			this.author = author;
			this.price = price;
		}

		// getter and setter methods
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getBookTitle() {
			return bookTitle;
		}
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "\n [id=" + id + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + "]";
		}	
	
}
