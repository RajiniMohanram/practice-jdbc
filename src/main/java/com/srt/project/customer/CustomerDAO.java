package com.srt.project.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.srt.project.app.util.DbUtil;

public class CustomerDAO {
	public void findCustomer(int id) {
		try {
			Connection con = DbUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customers where customerNumber="+id);
			if(rs.next()) {
				System.out.println("Customer Name: "+rs.getString(2));
				System.out.println("Contact Last Name: "+rs.getString(3));
				System.out.println("Credit Limit: "+rs.getDouble(6));
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void addCustomer() {
		
	}
	
	public void deleteCustomer(int id) {
		
	}
	
	public void updateCustomer() {
		
	}
}
