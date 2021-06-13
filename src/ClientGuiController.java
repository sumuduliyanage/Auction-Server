/*
Authors:E/16/200
		E/16/203
		E/16/217
This class controls the client gui
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.ArrayList;


public class ClientGuiController
{
	
	private Socket connectionSocket;
	private ClientGui window;
	private String name;
	private String symbol;
	private StockInfo item;
	private double newPrice;
	private static HashMap<String, ClientGuiController> users = new HashMap<String, ClientGuiController>();
	
	
	ClientGuiController(Socket connectionSocket){
		this.connectionSocket = connectionSocket;//connection socket
		
		//the client gui is set to be visible
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ClientGui();
					window.frmClient.setVisible(true);
					window.frmClient.setVisible(true);
					window.frmClient.setLocationRelativeTo(null); 
					window.frmClient.setResizable(false);
					
					//getting the name from the user-textField button -btnOk
					window.btnOk.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e1) {
						nameokaction();
					}
					});
					
					//when we enter a symbol of a company to bid
					window.btnGo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e2) {
						symbolgoaction();
					}
					});
					
					//when we click on Confirm button to give a price
					window.btnConfirm.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e3) {
						priceconfirmaction();
					}
					});
					
					//to exit from the client 
					window.btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e4) {
						
						try {
						   connectionSocket.close(); 
						   //users.remove(name);//check
						}
						catch(IOException e) {
						  e.printStackTrace();
						}
						finally{
						  //System.exit(0);
						  window.frmClient.dispose();
						}
						
						
					}
					});
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	//button to enter the name
	private void nameokaction (){
		name = window.textField.getText();	
					
		if ( window.textField.getText().isEmpty() ){//if name is empty
			JOptionPane.showMessageDialog(null, "Name Field Is Empty!Please Enter A Name To Place The Bid!!!");
		}
		else if(users.get(name) == null){
			users.put(name, this);
			JOptionPane.showMessageDialog(null, "Connection Successfull!");
			window.textField.setEnabled(false);
			window.btnOk.setEnabled(false);
			window.textField_1.setEnabled(true);
			window.btnGo.setEnabled(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Name Already exists. Please enter  another");
		}
			
	}
	
	//button to enter the symbol of the company
	private void symbolgoaction(){
	   symbol = window.textField_1.getText();
	   
	  // synchronized (item){
		   syncedAction_1();
		   //}
	     
	}


	//to confirm the price of an item
	private void priceconfirmaction(){
		try{
			
			newPrice=Double.parseDouble(window.textField_2.getText());// getting the new price
			syncedAction_2();
			
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "invalid Price"); //if error value given as input
        }
	}
	
		private synchronized void syncedAction_1(){
			item = StockDB.getStockInfo(symbol);
			window.lblCurrentlyUnavailable.setText(symbol);
		 if(!StockDB.isExist(symbol)){
				window.lblCurrentlyUnavailable_1.setText("This Item is Unavailable");
				window.lblCurrentlyUnavailable_2.setText("Unavailable");  
				window.label_3.setText("-1");
				window.textField_2.setEnabled(false);
		        window.btnConfirm.setEnabled(false);
		   }else{
				window.lblCurrentlyUnavailable_1.setText(item.getSecurity_name());
				window.lblCurrentlyUnavailable_2.setText(""+item.getPrice());
				window.label_3.setText("");
				window.textField_2.setEnabled(true);
				window.btnConfirm.setEnabled(true);
				//window.textField_1.setEnabled(false);//check
				//window.btnGo.setEnabled(false); // check
			}
	 }
	
	
	private synchronized void syncedAction_2(){
		if (newPrice <= item.getPrice()){
				JOptionPane.showMessageDialog(null, "The price you entered must be more than the current price");
			}
			else{
				
				JOptionPane.showMessageDialog(null, "Thank you! You successfuly placed the bid");
				StockDB.setPrice(symbol, newPrice); //set price of Map
				Bid newbid =new Bid(name, symbol, new Date(), newPrice); //adding a new bid
				BidDB.addBid(newbid); //adding the new bid into BidDB
				window.lblCurrentlyUnavailable_2.setText(""+item.getPrice());
				window.textField_2.setEnabled(false);//CHECK
				window.btnConfirm.setEnabled(false);//CHECK
			}
	}
	
	
	
}
