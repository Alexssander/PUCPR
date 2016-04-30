package br.pucpr.dao;

import java.util.List;

import br.pucpr.db.DBConnect;
import br.pucpr.model.Client;

public class ClientDAO {
	private DBConnect db;
	
	public ClientDAO(){
		this.db = new DBConnect();
	}
	
	public void insert(Client c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void update(Client c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public void remove(Client c){
		db.openConnect();
		
		db.executeSQL("SQL...");
		
		db.closeConnect();
	}
	
	public List<Client> findAll(){
		db.openConnect();
		
		List result = (List) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
	
	public Client findById(Integer id){
		db.openConnect();
		
		Client result = (Client) db.executeSQL("SQL...");
		
		db.closeConnect();
		
		return result;
	}
}
