package model;

import javax.swing.SwingUtilities;

import controller.ButtonController;
import view.LogIn;
import view.MainWindow;
import view.Registration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			
			@Override
			public void run(){
				
				MainWindow view = new MainWindow();
				view.setVisible(true);
				ButtonController controller = new ButtonController(view);
				view.RegisterController(controller);
				view.LogInController(controller);
				view.LogOutController(controller);
			}
		}
		);
	}
}
