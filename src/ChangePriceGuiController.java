/*
Authors:E/16/200
		E/16/203
		E/16/217
ChangePriceGui is controlled in this class
 */


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

public class ChangePriceGuiController{
	
	private ChangePriceGui window;
	
	//StockList Gui is set to be visible
	ChangePriceGuiController(){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ChangePriceGui();
					window.frmChangePrice.setVisible(true);
					window.frmChangePrice.setLocationRelativeTo(null); 
					window.frmChangePrice.setResizable(false);
					
					//when we click on search button
					window.btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						searchAction();
					}
					});
					
					//when we click on submit button
					window.btnSubmit.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							submitAction();
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	//when search button is clicked
	private void searchAction(){
       String symbol = window.textField.getText();
       window.lblNewLabel_1.setText(symbol);
       if(!StockDB.isExist(symbol)){
           window.lblFg.setText("This Stock Item is Unavailable");
           window.lblCurrentyUnavailable.setText("Unavailable");
           window.textField_1.setEnabled(false);
           window.btnSubmit.setEnabled(false);
       }else{
           window.lblFg.setText(StockDB.getStockInfo(symbol).getSecurity_name());
           window.lblCurrentyUnavailable.setText(""+StockDB.getStockInfo(symbol).getPrice());
           window.textField_1.setEnabled(true);
           window.btnSubmit.setEnabled(true);
           window.textField_1.setText("");
       }
    }
    
    //when we submit the new price
    private void submitAction(){
		
        try{
			String symbol = window.textField.getText();//taking the symbol
			double newPrice=Double.parseDouble(window.textField_1.getText());// getting the new price
			StockDB.setPrice(symbol, newPrice); //set price of Map
			
			Bid newbid =new Bid("By Server", symbol, new Date(), newPrice); //adding a new bid
			BidDB.addBid(newbid); //adding the new bid into BidDB
			JOptionPane.showMessageDialog(null, "Price Changed");
			
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "invalid Price"); //if error value given as input
        }
    }
	
	
	
	
}

