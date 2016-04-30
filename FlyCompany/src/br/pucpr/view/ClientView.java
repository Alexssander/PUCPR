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
	
	private void validation(){
		if(c.getName() != null && c.getName().length() > 5)
			valid = true;
		else
			valid= false;
	}
	
	public void btnSave(){
		validation();
		
		if(valid == true)
			control.insertCustomer(c);
		else
			msg = "No no no";
	}
	
	public void btnUpdate(){
		validation();
		
		if(valid == true)
			control.updateCustomer(c);
		else
			msg = "No no no";
	}
	
	public void btnRemove(){
		control.removeCustomer(c);
	}
	
	public void loadCustomerList(){
		control.findAllCustomer();
	}
	
	public void btnSearch(){
		if(c.getName() != null)
			control.findCustomerByName(c.getName());
		else
			control.findAllCustomer();
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
