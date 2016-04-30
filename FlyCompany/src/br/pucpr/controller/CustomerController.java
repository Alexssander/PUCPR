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
		
		if(aux != null){
			aux.setName(c.getName());
			dao.update(aux);
		}
	}
	
	public void removeCustomer(Customer c){
		Customer aux = dao.findById(c.getId());
		
		if(aux != null)		
			dao.remove(c);
	}
	
	public List<Customer> findAllCustomer(){
		return dao.findAll();
	}
	
	public Customer findCustomerById(Integer id){
		return dao.findById(id);
	}
	
	public Customer findCustomerByName(String name){
		return dao.findByName(name);
	}
}
