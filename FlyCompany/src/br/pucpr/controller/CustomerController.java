package br.pucpr.controller;

import java.util.List;

import br.pucpr.dao.CustomerDAO;
import br.pucpr.model.Customer;

public class CustomerController {
	private CustomerDAO dao;
	
	public CustomerController(){
		this.dao = new CustomerDAO();
	}
	
	public void insertCustomer(Customer c){
		dao.insert(c);
	}
	
	public void updateCustomer(Customer c){
		Customer aux = dao.findById(c.getId());
		aux.setName(c.getName());
		
		dao.update(aux);
	}
	
	public void removeCustomer(Customer c){
		dao.remove(c);
	}
	
	public List<Customer> findAllClient(){
		return dao.findAll();
	}
	
	public Customer findClientById(Integer id){
		return dao.findById(id);
	}
}
