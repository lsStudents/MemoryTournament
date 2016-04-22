package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.lang.*;

import view.VentanaError;
import model.CarsManagement;
import network.MessageServiceWorker;
import controller.ButtonController;

public class ServerConnection {
	
	private ServerSocket sServer;
	private static final int PORT = 12345;
	private MessageServiceWorker msWorker;
	private String response = " ";
	
	private ButtonController controller;
	public ServerConnection(ButtonController controller) {
		this.controller = controller;
	}

	public void startService(){
		try{
			
			sServer = new ServerSocket(PORT);
			msWorker = new MessageServiceWorker(this, sServer);
			new Thread(msWorker).start();
			System.out.println("Server Started");
			Counter c = new Counter(controller, this);
			new Thread(c).start();
			} catch (IOException e){
			VentanaError v = new VentanaError("SERVER CONNECTION ERROR (message not sent)");
		}
	}
	
	public void stopService(){
		try{
			msWorker.stopListening();
			sServer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void messageReceived(String message){
		controller.showMessage(message);
	}
	
	public void setMessage (String s){
		this.response = s;
	}
	
	public void sendMessage(String message){
		this.response = message;	
		
	}
	
	public String getResponse(){
		return this.response;
	}
}
