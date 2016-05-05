package br.pucpr.controller;

import java.util.List;

import br.pucpr.dao.CustomerDAO;
import br.pucpr.exception.FlyException;
import br.pucpr.model.Customer;

public class CustomerController {
	private CustomerDAO dao;
	
	public CustomerController(){
		this.dao = new CustomerDAO();
	}
	
	public void insertCustomer(Customer c)throws FlyException{
		Customer aux = dao.findById(c.getId());
		
		if(aux == null)
			dao.insert(c);
		else new FlyException("Customer not foud");
	}
	
	public void updateCustomer(Customer c)throws FlyException{
		Customer aux = dao.findById(c.getId());
		
		if(aux != null){
			aux.setName(c.getName());
			dao.update(aux);
		}else new FlyException("Customer not foud");
	}
	
	public void removeCustomer(Customer c)throws FlyException{
		Customer aux = dao.findById(c.getId());
		
		if(aux != null)		
			dao.remove(c);
		else new FlyException("It was not possible to remove");
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
