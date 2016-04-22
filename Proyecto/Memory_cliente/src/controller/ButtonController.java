package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.User;
import view.LogIn;
import view.MainWindow;
import view.Registration;
import view.VentanaError;

public class ButtonController implements ActionListener{
	private MainWindow view;
	private User model;
	private VentanaError ve;
	
	public ButtonController (MainWindow view){
		this.view = view;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals("Register")){
			Registration r = new Registration();
			r.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Log in")){
			LogIn li = new LogIn();
			li.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Log out")){
			ve = new VentanaError("Has salido sin problemas");
			ve.setVisible(true);
		}
	}
	
	public void showMessage(String s){
		ve = new VentanaError(s);
		ve.setVisible(true);
	}

	
}
