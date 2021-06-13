/*
Authors:E/16/200
		E/16/203
		E/16/217
This class is the client class
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;


public class Client implements Runnable{
    private Socket connectionSocket;
    
    public Client(Socket connectionSocket) {//constructor
        this.connectionSocket = connectionSocket;
    }

    @Override
    public void run() {
        try {
            handle();
        } catch (IOException ex) {
        }
    }

    public void startThread(){//threads
        Thread thread = new Thread(this);
        thread.start();//thread is started
    }
    
    
    private void handle() throws IOException{ 
	
	try {
		ClientGuiController  clientguicontroller = new ClientGuiController(connectionSocket);//the client gui contoller is called
        connectionSocket.close();
                       
        } catch (IOException iOException) {
            this.connectionSocket.close();
        }
    }
    
    
}

