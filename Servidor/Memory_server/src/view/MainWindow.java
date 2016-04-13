package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import controller.ButtonController;

public class MainWindow extends JFrame{
	

	private JButton Inserir;
	private JButton Registrar;
	private JTextArea jtaList2;
	private JTextArea jtaList3;
	
	private JPanel topVisualitza;
	private JPanel botVisualitza;
	
	private JLabel horaInici;
	private JLabel durada;
	private JLabel iniciCompeticio;
	private JLabel temps;
	private JLabel min2;
	private JLabel seg2;
	private JLabel tempsCompeticio;
	private JLabel restants;
	private JLabel partides;
	private JLabel jugador;
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	

	
	public MainWindow(){
		// TODO Auto-generated constructor stub
		JTabbedPane CRS = new JTabbedPane();
		
		//creem el panell Register Car
		JPanel jpRegister = new JPanel();
		jpRegister.setLayout(new GridLayout(2, 1));
		
		//Editem el panel top
		topVisualitza = new JPanel(new GridLayout(2,1));
		topVisualitza.setBorder(BorderFactory.createLineBorder(Color.black));
		
		Inserir = new JButton("Inserir");
		JPanel topTop = new JPanel();
		topTop.setBackground(Color.white);
		
		GroupLayout layout = new GroupLayout(topTop);
		topTop.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		horaInici = new JLabel("Hora de Inici");
		durada = new JLabel("Minuts de Durada");
		iniciCompeticio = new JLabel("Inici de la competició:");
		temps= new JLabel(dateFormat.format(date));
		
		text1 = new JTextField();
		text2 = new JTextField();
		
		JPanel jp = new JPanel(new GridLayout(1,2));
		jp.add(iniciCompeticio);
		jp.add(temps);
		jp.setBackground(Color.white);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(horaInici)
					.addComponent(durada))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(text1)
					.addComponent(text2))
			    
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(Inserir)
					.addComponent(Inserir))
				
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, 400)
				

			);
		
		layout.setVerticalGroup(layout.createSequentialGroup()
			    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			        .addComponent(horaInici)
			        .addComponent(text1)
			        .addComponent(Inserir))
			    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    	.addComponent(durada)
			    	.addComponent(text2)
			    	.addComponent(Inserir))
			    			    

			);
		
		topVisualitza.add(topTop);
		topVisualitza.add(jp);
		jpRegister.add(topVisualitza);
		
		//editem el panel d'abaix
		botVisualitza = new JPanel(new GridLayout(4,4));
		botVisualitza.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		tempsCompeticio = new JLabel("Temps Competicio:");
		restants = new JLabel("Restants");
		partides = new JLabel ("Partides Realitzades;");
		jugador = new JLabel("Jugador Nº1:");
		min2 = new JLabel("min");
		seg2 = new JLabel("seg");
		
		
		GroupLayout lbot = new GroupLayout(botVisualitza);
		botVisualitza.setLayout(lbot);
		lbot.setAutoCreateGaps(true);
		lbot.setAutoCreateContainerGaps(true);
		
		lbot.setHorizontalGroup(lbot.createSequentialGroup()
				.addGroup(lbot.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(tempsCompeticio)
					.addComponent(min2)
					.addComponent(partides)
					.addComponent(jugador))
				.addComponent(seg2)
			    .addComponent(restants)

			);
		
		lbot.setVerticalGroup(lbot.createSequentialGroup()
				.addComponent(tempsCompeticio)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, 30)
			    .addGroup(lbot.createParallelGroup(GroupLayout.Alignment.BASELINE)
			        .addComponent(min2)
			        .addComponent(seg2)
			        .addComponent(restants))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
	                     GroupLayout.DEFAULT_SIZE, 50)
			    .addComponent(partides)
			    .addComponent(jugador)
			    			    

			);
		
		jpRegister.add(botVisualitza);
				
		CRS.addTab("Configurar i Visualitzar Competicio", jpRegister);
		
		// panell dos
		JPanel jpDelete= new JPanel(new GridLayout(2,1));
		JPanel jtop = new JPanel(new MigLayout());
		JPanel jbot = new JPanel();
		jtop.setBorder(BorderFactory.createLineBorder(Color.black));
		jbot.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JPanel aux = new JPanel(new GridLayout(7,1));
		JPanel aux2 = new JPanel(new GridLayout(7,1));
		text3 = new JTextField(10);
		text4 = new JTextField(10);
		Registrar = new JButton("Registrar");
	    JPanel panel = new JPanel(new MigLayout());
	    panel.add(firstNameLabel);
	    panel.add(firstNameTextField);
	    panel.add(lastNameLabel,       "gap unrelated");
	    panel.add(lastNameTextField,   "wrap");
	    panel.add(addressLabel);
	    panel.add(addressTextField,    "span, grow");
		
		/*
		aux.add(new JLabel(""));
		aux.add(new JLabel("Registrar:"));
		
		aux2.add(new JLabel(""));
		aux2.add(new JLabel(""));
		aux2.add(new JLabel(""));
		aux2.add(new JLabel(""));
		aux2.add(new JLabel("Nickname:"));
		aux2.add(new JLabel(""));
		aux2.add(text3);
		aux2.add(new JLabel(""));
		aux2.add(new JLabel("Paraula de Pas:"));
		aux2.add(new JLabel(""));
		aux2.add(text4);
		
		
		jtop.add(aux, BorderLayout.WEST);
		jtop.add(aux2, BorderLayout.CENTER);
		jtop.add(Registrar, BorderLayout.EAST);
		*/
		Object[][] data = {{"Puta","Noa","Duran Plass","200","2:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},
				{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},
				{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"},{"Crac","Manel","Manchon Gasco","500","1:00h"}};
		String[] Columnes = {"Nickname","Nombre","Apellidos","Puntuacion","Horas Jugadas"};

		JTable table = new JTable(data,Columnes);
		table.setPreferredScrollableViewportSize(new Dimension(450, 175));

		JScrollPane scrollPane = new JScrollPane(table);
		jbot.add(scrollPane);
		
		jpDelete.add(jtop);
		jpDelete.add(jbot);
		
		CRS.addTab("Gestionar Usiaris", jpDelete);
		
		//panell tres - List cars
		JPanel jpClassificacio = new JPanel(new BorderLayout());
		
		Object[][] d = {{"Lenam96","2000"},{"dfoasfo","3000"}};
		String[] colum = {"Nickname","Puntuacio Total"};

		JTable t = new JTable(d,colum);
		table.setPreferredScrollableViewportSize(new Dimension(450, 175));

		JScrollPane sP = new JScrollPane(t);
		jpClassificacio.add(sP);
		
		CRS.addTab("Mostrar Classificació", jpClassificacio);
				
				//panell tres - List cars
				JPanel jpJugador = new JPanel(new BorderLayout());
				jpJugador .setBorder(BorderFactory.createTitledBorder("Refreshing every 5 seconds."));
				jtaList3 = new JTextArea();
				JScrollPane jspCarList3 = new JScrollPane(jtaList2);
				jtaList3.setEditable(false);
				jspCarList3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				jspCarList3.setPreferredSize(new Dimension(250,250));
				jtaList3.setText("No hi ha cotxes al sistema");
				jtaList3.setEditable(false);
				jpJugador.add(jspCarList3, BorderLayout.CENTER);
				this.getContentPane().add(jpJugador, BorderLayout.CENTER);
				
				CRS.addTab("Mostrar Grafic", jpJugador);
					
		
		this.getContentPane().add(CRS);
		

		this.setSize(610, 500);
		this.setTitle("MemoTournament - **SERVER**");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
