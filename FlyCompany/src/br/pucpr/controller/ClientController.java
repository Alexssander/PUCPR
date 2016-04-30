package br.pucpr.controller;

import java.util.List;

import br.pucpr.dao.ClientDAO;
import br.pucpr.model.Client;

public class ClientController {
	private ClientDAO dao;
	
	public ClientController(){
		this.dao = new ClientDAO();
	}
	
	public void insertClient(Client c){
		dao.insert(c);
	}
	
	public void updateClient(Client c){
		dao.update(c);
	}
	
	public void removeClient(Client c){
		dao.remove(c);
	}
	
	public List<Client> findAllClient(){
		return dao.findAll();
	}
	
	public Client findClientById(Integer id){
		return dao.findById(id);
	}
}
