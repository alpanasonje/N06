package com.tnsif.hibernateex.manytomanybi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "productsSet")
	private Set<Orders> orders;

	// Default Constructor
	public Products() {

	}

	// Parameterized Constructor
	public Products(int id, String name, Set<Orders> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	// Get and Set methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}

}
