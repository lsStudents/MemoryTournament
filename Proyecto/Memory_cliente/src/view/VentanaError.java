package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaError extends JFrame{

private JLabel jlEtiqueta;
	
	public VentanaError(String title) {
		
		jlEtiqueta = new JLabel(title);
		jlEtiqueta.setHorizontalAlignment(JLabel.CENTER);

		getContentPane().add(jlEtiqueta, BorderLayout.CENTER);

		setSize(350,100);
		setTitle("ERROR 404");
		setLocationRelativeTo(null);
	}
}
