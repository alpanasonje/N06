package com.tnsif.hibernateex.manytomanybi;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Orders {
	@Id
	private int id;
	private Date purchaseDate;
	@ManyToMany
	private Set<Products> productsSet;

	// Default Constructor
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Orders(int id, Date purchaseDate, Set<Products> productsSet) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.productsSet = productsSet;
	}

	// Get and Set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Products> getProductsSet() {
		return productsSet;
	}

	public void setProductsSet(Set<Products> productsSet) {
		this.productsSet = productsSet;
	}

	// toString()
	@Override
	public String toString() {
		return "Orders [id=" + id + ", purchaseDate=" + purchaseDate + ", productsSet=" + productsSet + "]";
	}
}
