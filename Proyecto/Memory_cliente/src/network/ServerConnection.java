package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import controller.ButtonController;


public class ServerConnection {

	private Socket socket;
	private DataOutputStream doStream;
	private DataInputStream diStream;
	private ButtonController controller;
	private static final String IP = "localhost";
	private static final int PORT = 12345;
	private String responseServer = " ";
	
	public ServerConnection(ButtonController controller) {
		// TODO Auto-generated constructor stub
		this.controller = controller;
	}
	
	public void sendMessage (String message){
		try{
			socket = new Socket (IP,PORT);
			doStream = new DataOutputStream(socket.getOutputStream());
			diStream = new DataInputStream(socket.getInputStream());
			doStream.writeUTF(message);
			responseServer = diStream.readUTF();
			socket.close();
		}catch (IOException e){
			controller.showMessage("SERVER CONNECTION ERROR (message not sent)");
		}
	}
}
