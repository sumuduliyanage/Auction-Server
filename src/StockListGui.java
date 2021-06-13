/*
Authors:E/16/200
		E/16/203
		E/16/217
Gui to show the list of Items in the stock
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class StockListGui extends JFrame{

	public JFrame frmStockItemList;
	public JTable table;
	private JScrollPane scrollPane;

	
	/**
	 * Create the application.
	 */
	public StockListGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStockItemList = new JFrame();
		frmStockItemList.getContentPane().setBackground(SystemColor.controlDkShadow);
		frmStockItemList.setForeground(SystemColor.text);
		frmStockItemList.setBackground(SystemColor.controlDkShadow);
		frmStockItemList.setTitle("Stock Item List");
		frmStockItemList.setBounds(100, 100, 1215, 776);
		frmStockItemList.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStockItemList.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stock Item List");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		lblNewLabel.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel.setBounds(413, 0, 390, 76);
		frmStockItemList.getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 88, 1203, 646);
		frmStockItemList.getContentPane().add(scrollPane);
		
		table = new JTable();
		    table.setFont(new java.awt.Font("Tahoma", 0, 16));
            table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Symbol", "Name", "Current Price"
            }
        ) 
        
            {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        //-----------
		
		table.setBackground(new Color(176, 224, 230));
		table.setFont(new Font("Dialog", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		
		
		//-----
		if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(50);
        }
		
	}
}
