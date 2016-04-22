package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	
	private JButton jbStart;
	private JLabel jtTSession;
	private JLabel jtNickname;
	private JLabel jtPassword;
	private JTextField jtUser;
	private JTextField jtUserP;
	
	public LogIn(){
		jbStart = new JButton();
		jtTSession = new JLabel();
		jtPassword = new JLabel();
		jtNickname = new JLabel(); 
		jtUser = new JTextField();
		jtUserP = new JTextField();
		
		JPanel jpLogIn = new JPanel(new GridLayout(6,1));
		jtTSession.setText("START SESSION");
		jtTSession.setFont(new Font("Myriad Pro", Font.PLAIN, 30));
		jtNickname.setText("Enter your Nickname:");
		jtPassword.setText("Enter your Password");
		jbStart.setText("LogIn");
		
		jpLogIn.add(jtTSession);
		jpLogIn.add(jtNickname);
		jpLogIn.add(jtUser);
		jpLogIn.add(jtPassword);
		jpLogIn.add(jtUserP);
		jpLogIn.add(jbStart);
		
		this.getContentPane().add(jpLogIn, BorderLayout.CENTER);
		
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("**LogIn**");
		
	}
}
