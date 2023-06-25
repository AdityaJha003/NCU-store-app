package org.ncu.miniapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import javax.validation.constraints.Pattern;

public class User {
	@NotNull
	@Pattern(regexp="^[a-zA-Z]", message="enter valid name")
	private String Fname ;
	@NotNull
	@Pattern(regexp="^[a-zA-Z]", message="enter valid name")
	private String Lname ;
	@NotNull
	@Pattern(regexp="^[a-zA-Z]", message="enter valid name")
	private String Uname ;
	@NotNull
	@Pattern(regexp="  ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$\n"
			+ "", message="")
	private String Pass ;
	@NotNull
	private String Email ;
	@NotNull
	private String UType ;
	private List<String> list;
	
	public User() {
		list=new ArrayList<String>();
		list.add("Seller");
		list.add("Buyer");
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUType() {
		return UType;
	}
	public void setUType(String uType) {
		UType = uType;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
