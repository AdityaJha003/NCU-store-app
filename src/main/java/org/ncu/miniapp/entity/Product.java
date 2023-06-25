package org.ncu.miniapp.entity;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Product {

	@Override
	public String toString() {
		return "Product [Sname=" + Sname + ", Category=" + Category + ", Pname=" + Pname + ", Quantity=" + Quantity
				+ ", PDesc=" + PDesc + ", Price=" + Price + "]";
	}
	@NotNull
	private String Sname ;
	@NotNull
	private String Category ;
	@NotNull
	private String Pname ;
	@NotNull
	@Pattern(regexp="^[0-9]",message="only integers")
	private int Quantity ;
	@NotNull
	private String PDesc ;
	@NotNull
	private String Price;
	private List<String> buylist;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getPDesc() {
		return PDesc;
	}
	public void setPDesc(String pDesc) {
		PDesc = pDesc;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public List<String> getBuylist() {
		return buylist;
	}
	public void setBuylist(List<String> buylist) {
		this.buylist = buylist;
	}
	 
	
}
