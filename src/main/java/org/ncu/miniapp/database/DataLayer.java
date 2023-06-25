package org.ncu.miniapp.database;

import java.util.List;

import org.ncu.miniapp.entity.Product;

public interface DataLayer {
	public void insert();
	public String typecheck();
	public void addProduct();
	public List<Product> showProducts();
	public List<Product> boughtProducts(List<String> Pnames);
}
