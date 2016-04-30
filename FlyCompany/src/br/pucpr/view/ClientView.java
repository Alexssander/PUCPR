package br.pucpr.view;

import br.pucpr.controller.CustomerController;
import br.pucpr.model.Customer;

public class ClientView {
	private boolean valid;
	private String msg;
	private Customer c;
	private CustomerController control;

	public ClientView(){
		msg = "";
		c = new Customer();
		control = new CustomerController();
	}
	
	public void validation(){
		valid = true;
	}
	
	public void btnSave(){
		control.insertCustomer(c);
	}
	
	public void showMsg(){
		System.out.println("Message: " + msg);
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
