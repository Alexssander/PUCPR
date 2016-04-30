package br.pucpr.view;

import br.pucpr.controller.ClientController;
import br.pucpr.model.Client;

public class ClientView {
	private boolean valid;
	private String msg;
	private Client c;
	private ClientController control;

	public ClientView(){
		msg = "";
		c = new Client();
		control = new ClientController();
	}
	
	public void validation(){
		valid = true;
	}
	
	public void btnSave(){
		control.insertClient(c);
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
