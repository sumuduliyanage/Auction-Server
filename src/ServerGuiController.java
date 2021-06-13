/*
Authors:E/16/200
		E/16/203
		E/16/217
This class controls the ServerGui
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ServerGuiController extends Thread {
	
	private static ServerGui window;
	
	//Server Gui is set to be visible
	ServerGuiController(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ServerGui();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null); 
					window.frame.setResizable(false);
					
					
					//action listener for change the price button
					 window.btnPriceCng.addActionListener(new ActionListener() {
					 @Override
						public void actionPerformed(ActionEvent e) {
							 ChangePriceGuiController pricecng = new ChangePriceGuiController();
						}
					 });
					 
					 //action listener to list the stock items
					window.btnList.addActionListener(new ActionListener() {
					@Override
						public void actionPerformed(ActionEvent e) {
							StockListGuiController listdisp = new StockListGuiController();
						}
					});
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	//updating the table in the server with the newly added bid
	public static void FillTable(Bid bid){
        DefaultTableModel tableobject = (DefaultTableModel)window.table.getModel();
        
        //DefaultTableModel tableobject = new DefaultTableModel();
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat timeFormat = new SimpleDateFormat("HH-mm-ss");
        String date=dateFormat.format(bid.getDate());
        String time=timeFormat.format(bid.getDate());
        
        Object newRow []={bid.getClientName(),bid.getSymbol(),date,time,bid.getPrice()};
        tableobject.addRow(newRow);  
        
        //window.table.setModel(tableobject);
    }
    
    private void updateloop(){
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               Logger.getLogger(ServerGuiController.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (NullPointerException exx){
			}
            
            
            
            window.label.setText(""+StockDB.getStockInfo("FB").getPrice());
            window.label_1.setText(""+StockDB.getStockInfo("VRTU").getPrice());
            window.label_2.setText(""+StockDB.getStockInfo("MSFT").getPrice());
            window.label_3.setText(""+StockDB.getStockInfo("GOOGL").getPrice());
            window.label_4.setText(""+StockDB.getStockInfo("YHOO").getPrice());
            window.label_5.setText(""+StockDB.getStockInfo("XLNX").getPrice());
            window.label_6.setText(""+StockDB.getStockInfo("TSLA").getPrice());
            window.label_7.setText(""+StockDB.getStockInfo("TXN").getPrice());
        }
    }
    
    
     @Override
    public void run() {
		try{
			 updateloop();
		}
		catch (NullPointerException exxx){
		}
       
    }
	
	
	
}
