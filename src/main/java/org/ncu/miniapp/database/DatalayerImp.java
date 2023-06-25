package org.ncu.miniapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ncu.miniapp.entity.Product;
import org.ncu.miniapp.entity.User;

public class DatalayerImp implements DataLayer {
	
	User m;
	Product p;
	
	public DatalayerImp() {
		
	}
	
	public DatalayerImp (User m){
		this.m=m;
	}
	
	public DatalayerImp (Product p){
		this.p=p;
	}
	
	Connection connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "JDBC:mysql://localhost/User";
			String user = "root";
			String pass = "Adiironman@2003";
			return DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public void insert() {
		try {
			String query = "insert into Details values (?,?,?,?,?,?);";
			Connection con=connectDB();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,m.getFname());
			stmt.setString(2, m.getLname());
			stmt.setString(3, m.getUname());
			stmt.setString(4, m.getPass());
			stmt.setString(5, m.getEmail());
			stmt.setString(6, m.getUType());
			System.out.println(stmt.executeUpdate());		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public String typecheck() {
		try {
			String query = "select UType from Details where Uname = ? and Pass = ?";
			Connection con=connectDB();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, m.getUname());
			stmt.setString(2, m.getPass());
			ResultSet rs = stmt.executeQuery();//when using select query don't pass a parameter in this method call
			rs.next();
			String s=rs.getString(1);
			return s;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public void addProduct() {
		try {
			String query = "insert into Product values (?,?,?,?,?,?);";
			Connection con=connectDB();
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,p.getSname());
			stmt.setString(2, p.getCategory());
			stmt.setString(3, p.getPname());
			stmt.setInt(4, p.getQuantity());
			stmt.setString(5, p.getPDesc());
			stmt.setString(6, p.getPrice());
			System.out.println(stmt.executeUpdate());		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<Product> showProducts() {
		List<Product> list=new ArrayList<Product>();
		try {
			Connection con =connectDB();
			String query = "select * from Product";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				 Product temp=new Product();
				 temp.setSname(rs.getString(1));
				 temp.setCategory(rs.getString(2));
				 temp.setPname(rs.getString(3));
				 temp.setQuantity(rs.getInt(4));
				 temp.setPDesc(rs.getString(5));
				 temp.setPrice(rs.getString(6));
				
				 list.add(temp);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
	}

	@Override
	public List<Product> boughtProducts(List<String> Pnames) {
		List<Product> list=new ArrayList<Product>();
		try {
			Connection con =connectDB();
			for(String p:Pnames) {
				String query = "select * from Product where Pname=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, p);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					 Product temp=new Product();
					 temp.setSname(rs.getString(1));
					 temp.setCategory(rs.getString(2));
					 temp.setPname(rs.getString(3));
					 temp.setQuantity(rs.getInt(4));
					 temp.setPDesc(rs.getString(5));
					 temp.setPrice(rs.getString(6));
					
					 list.add(temp);
				}
			}
			

		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

	
	
}
