package br.pucpr.dao;

import java.util.List;

import br.pucpr.db.DBConnect;
import br.pucpr.model.Customer;

public class CustomerDAO {
	private DBConnect db;
	
	public CustomerDAO(){
		this.db = new DBConnect();
	}
	
	public void insert(Customer c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void update(Customer c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void remove(Customer c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public List<Customer> findAll(){
		db.openConnect();
		
		List result = (List) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
	
	public Customer findById(Integer id){
		db.openConnect();
		
		Customer result = (Customer) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}

	public Customer findByName(String name) {
		db.openConnect();
		
		Customer result = (Customer) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
}
