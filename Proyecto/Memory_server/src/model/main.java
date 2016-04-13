package model;

import javax.swing.SwingUtilities;

import view.MainWindow;
import controller.ButtonController;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// crea la vista
				MainWindow vista = new MainWindow();
				// creem el model
				
				// crea el controlador i estableix la relacio C->V i C->M
				ButtonController controlador = new ButtonController(vista);
				// establim la relacio V--->C
				
				// fem la vista visible
				vista.setVisible(true);
			}
		});
	}

}
