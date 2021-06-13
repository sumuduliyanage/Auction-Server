/*
Authors:E/16/200
		E/16/203
		E/16/217
Server is implemented
 */


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{
	
	public static final int PORT = 2000;
	
	
    public static void main(String [] args){

        StockDB stockDataStruct = new StockDB();//reading the csv file
        BidDB offerDatastruct = new BidDB();//bids information
        
        ServerGuiController guiController = new ServerGuiController();//controlling the server gui
        
        Thread guiThread = new Thread(guiController);
        
        guiThread.start();
        
        Server server = new Server();
        
        try {
            server.serverLoop();
        } catch (IOException ex) {
        }
    }
    
    
    
    public void serverLoop() throws IOException { 
		
        ServerSocket serverSocket = new ServerSocket(PORT); 
		while(true) { 
			Socket socket = serverSocket.accept(); // if error must close the socket
            Client newConnection = new Client(socket);
            newConnection.startThread();
		}
    }
    
    
	
}




