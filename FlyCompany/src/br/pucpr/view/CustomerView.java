package br.pucpr.view;

import br.pucpr.controller.CustomerController;
import br.pucpr.exception.FlyException;
import br.pucpr.model.Customer;

public class CustomerView {
	private boolean valid;
	private String msg;
	private Customer c;
	private CustomerController control;

	public CustomerView(){
		msg = "";
		c = new Customer();
		control = new CustomerController();
	}
	
	private void validation(){
		if(c.getName() != null && c.getName().length() > 5)
			valid = true;
		else
			valid = false;
	}
	
	public void btnSave(){
		validation();
		
		if(valid == true)
			try {
				control.insertCustomer(c);
			} catch (FlyException e) {
				msg = e.getMessage();
			}
		else
			msg = "No no no";
		
		showMsg();
	}
	
	public void btnUpdate(){
		validation();
		
		if(valid == true)
			try {
				control.updateCustomer(c);
			} catch (FlyException e) {
				msg = e.getMessage();
			}
		else
			msg = "No no no";
		
		showMsg();
	}
	
	public void btnRemove(){
		try {
			control.removeCustomer(c);
		} catch (FlyException e) {
			msg = e.getMessage();
		}
		
		showMsg();
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
