package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Registration extends JFrame{
	private JTextField jtfName;
	private JTextField jtfSurname;
	private JTextField jtfNickname;
	private JTextField jtfPassword;
	
	public  Registration(){
		//Creem el panell de registre
		jtfName = new JTextField();
		jtfSurname = new JTextField();
		jtfNickname = new JTextField();
		jtfPassword = new JTextField();
		JButton jbRegister = new JButton();
		JPanel jpReg = new JPanel(new GridLayout(5,1));
		JPanel jpName = new JPanel(new FlowLayout());
		JPanel jpSurname = new JPanel(new FlowLayout());
		JPanel jpNickname= new JPanel(new FlowLayout());
		JPanel jpPassword= new JPanel(new FlowLayout());
		JPanel jpButton= new JPanel(new FlowLayout());
		((FlowLayout) jpName.getLayout()).setAlignment(FlowLayout.LEFT);
		
		jpName.add(new JLabel("Name: "));
		jtfName.setPreferredSize(new Dimension(325, 28));
		jpName.add(jtfName);
		((FlowLayout) jpSurname.getLayout()).setAlignment(FlowLayout.LEFT);
		jpSurname.add(new JLabel("Surname: "));
		jtfSurname.setPreferredSize(new Dimension(320, 28));
		jpSurname.add(jtfSurname);
		((FlowLayout) jpNickname.getLayout()).setAlignment(FlowLayout.LEFT);
		jpNickname.add(new JLabel("Nickname: "));
		jtfNickname.setPreferredSize(new Dimension(328, 28));
		jpNickname.add(jtfNickname);
		((FlowLayout) jpPassword.getLayout()).setAlignment(FlowLayout.LEFT);
		jpPassword.add(new JLabel("Password: "));
		jtfPassword.setPreferredSize(new Dimension(328, 28));
		jpPassword.add(jtfPassword);
		
		((FlowLayout) jpButton.getLayout()).setAlignment(FlowLayout.RIGHT);
		jbRegister.setText("Register");
		jpButton.add(jbRegister);
		
		jpReg.add(jpName);
		jpReg.add(jpSurname);
		jpReg.add(jpNickname);
		jpReg.add(jpPassword);
		jpReg.add(jpButton);
		
		this.getContentPane().add(jpReg, BorderLayout.CENTER);
		this.setSize(420, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("**Registration**");

	}
	
}
