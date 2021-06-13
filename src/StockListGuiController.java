/*
Authors:E/16/200
		E/16/203
		E/16/217
This class controlls the StockListGui
 */

import java.awt.EventQueue;
import javax.swing.table.DefaultTableModel;


public class StockListGuiController{
	
	private StockListGui window;
	
	//StockList Gui is set to be visible
	StockListGuiController(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new StockListGui();
					window.frmStockItemList.setVisible(true);
					window.frmStockItemList.setLocationRelativeTo(null); 
					window.frmStockItemList.setResizable(false);
					stocklistFill();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void stocklistFill(){
		
        DefaultTableModel tableob = (DefaultTableModel)window.table.getModel();

        for (StockInfo itemdetail : StockDB.getValues()) {
			
            Object[] newRow = {itemdetail.getSymbol(), itemdetail.getSecurity_name(), itemdetail.getPrice()};
            tableob.addRow(newRow);
            
        }
        
    }
    
	
}
