package com.tnsif.jpaintro;

import java.util.List;

import javax.persistence.EntityManager;

public class ProductService {
	EntityManager em;
	public ProductService()
	{
		em=JPAIUtil.getEntityManager();
	}
	public void addProduct(Product product)
	{
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
	}
	public void deleteProduct(int productId)
	{
		Product exitsProduct=getProduct(productId);
		if (exitsProduct==null)
			System.out.println("No such product available for deletion");
		else
		{
			em.getTransaction().begin();
			em.remove(exitsProduct);
			em.getTransaction().commit();
		}
	}
	public void updateProduct(int productId, float rate) {
		Product exitsProduct=getProduct(productId);
		if (exitsProduct==null)
			System.out.println("No such product available for update");
		else
		{
			exitsProduct.setRate(rate);	
			em.getTransaction().begin();
			em.merge(exitsProduct);
			em.getTransaction().commit();
		}
	}
	public List<Product> getAllProducts()
	{
		List<Product> productList=null;
		return productList;
	}
	public Product getProduct(int productId)
	{
		return em.find(Product.class,productId );
	}
}
