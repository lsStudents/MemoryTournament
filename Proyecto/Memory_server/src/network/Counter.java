package network;

import view.MainWindow;
import controller.ButtonController;
import network.ServerConnection;

public class Counter implements Runnable{
	private boolean go;
	private ButtonController controller;
	private ServerConnection server;

	public Counter (ButtonController controller, ServerConnection s){
		this.controller = controller;
		this.server = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go = true;
		while(go){
			try{
				Thread.sleep(5000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			server.sendMessage(controller.prepareMessage());
		}	
	}
}
