package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	
	/* el cliente tiene 5 opciones del menú
	 * 1. registrarse
	 * 2. iniciar y cerrar sesión
	 * 3. entrar como invitado (modo de entrenamiento)
	 * 4. 
	 */
	private JButton jbRegister;
	private JButton jbSessionOn;
	private JButton jbSessionOff;
	private JButton jbGuest;
	private JButton jbM1;
	private JButton jbM2;
	private JButton jbRanking;
	private JLabel jtTitle;
	
	public MainWindow (){
		
		jbRegister = new JButton();
		jbSessionOn = new JButton();
		jbSessionOff = new JButton();
		jbGuest = new JButton();
		jbM1 = new JButton();
		jbM2 = new JButton();
		jbRanking = new JButton();
		
		
		//creem el panell del menu principal
		JPanel jpInici = new JPanel(new FlowLayout());
		((FlowLayout)jpInici.getLayout()).setAlignment(FlowLayout.CENTER);
		JPanel jpButtons = new JPanel(new GridLayout(10,1));
		jbRegister.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbRegister.setText("Register");
		jbSessionOn.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbSessionOn.setText("Log in");
		jbSessionOff.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbSessionOff.setText("Log out");
		jbGuest.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbGuest.setText("Training");
		jbM1.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbM1.setText("Time trial");
		jbM2.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbM2.setText("Vs Machine");
		jbRanking.setFont(new Font("Cambria", Font.PLAIN, 20));
		jbRanking.setText("Ranking");
		
		jtTitle = new JLabel();
		jtTitle.setText("WELCOME TO MEMOTOURNAMENT 2016");
		jtTitle.setFont(new Font("Myriad Pro", Font.PLAIN, 30));
		JLabel jtBlancs = new JLabel();
		jtBlancs.setText(" ");
		jtBlancs.setFont(new Font("Myriad Pro", Font.PLAIN, 30));
		JLabel jtBlancs2 = new JLabel();
		jtBlancs2.setText(" ");
		jtBlancs2.setFont(new Font("Myriad Pro", Font.PLAIN, 30));
		
		jpButtons.add(jtBlancs2);
		jpButtons.add(jtTitle);
		jpButtons.add(jtBlancs);
		
		jpButtons.add(jbRegister);
		jpButtons.add(jbSessionOn);
		jpButtons.add(jbSessionOff);
		jpButtons.add(jbGuest);
		jpButtons.add(jbM1);
		jpButtons.add(jbM2);
		jpButtons.add(jbRanking);
		
		
		jpInici.add(jpButtons, BorderLayout.PAGE_END);
		
		this.getContentPane().add(jpInici, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("**MemoTournament Client**");
	}
	
	public void RegisterController(ActionListener controller) {
		jbRegister.addActionListener(controller);
		jbRegister.setActionCommand("Register");
		System.out.println("Entra");
	}
	
	public void LogInController(ActionListener controller) {
		jbSessionOn.addActionListener(controller);
		jbSessionOn.setActionCommand("Log in");
		System.out.println("Entra");
	}
	
	public void LogOutController(ActionListener controller) {
		jbSessionOff.addActionListener(controller);
		jbSessionOff.setActionCommand("Log out");
	}
}

