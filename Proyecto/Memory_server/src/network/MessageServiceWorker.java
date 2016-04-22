package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import view.VentanaError;

public class MessageServiceWorker implements Runnable {
	
	private ServerConnection mService;
	private ServerSocket sServer;
	private Socket sClient = new Socket();
	private DataInputStream diStream;
	private DataOutputStream doStream;
	private boolean active;
	
	public MessageServiceWorker(ServerConnection mService, ServerSocket sServer) {
		this.mService = mService;
		this.sServer = sServer;
		active = true;
		// TODO Auto-generated constructor stub
	}
	
	
	public void run(){
		while (active){
			try{	
				
				sClient = sServer.accept();
				diStream = new DataInputStream(sClient.getInputStream());
				String newMessage = diStream.readUTF();
				mService.messageReceived(newMessage);
				doStream = new DataOutputStream(sClient.getOutputStream());
				System.out.println("Missatge sortida:   " + mService.getResponse());
				doStream.writeUTF(mService.getResponse());
				
				sClient.close();
			}catch(IOException e){}
		
		}
	}
	
	public void stopListening(){
		active = false;
	}
}
