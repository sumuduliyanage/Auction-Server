/*
Authors:E/16/200
		E/16/203
		E/16/217
Gui for the auction server
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ServerGui extends JFrame {

	public JFrame frame;
	public JTable table;
	public JButton btnPriceCng;
	public JButton btnList;
	public JLabel label;//fbprice
	public JLabel label_1;//vrtuprice
	public JLabel label_2;//msftprice
	public JLabel label_3;//googlprice
	public JLabel label_4;//yhoo price
	public JLabel label_5; //xlnx price
	public JLabel label_6; //tsla price
	public JLabel label_7; //txn price
	public JScrollPane scrollPane;//scroll pane

	

	/**
	 * Create the application.
	 */
	public ServerGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Auction Server");
		frame.setBackground(new Color(173, 255, 47));
		frame.getContentPane().setForeground(new Color(245, 245, 245));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(100, 100, 1396, 815);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auction Server");
		lblNewLabel.setForeground(new Color(245, 245, 245));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 45));
		lblNewLabel.setBounds(476, 37, 511, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FB");
		lblNewLabel_1.setBackground(SystemColor.controlDkShadow);
		lblNewLabel_1.setBounds(49, 152, 134, 55);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 27));
		
		JLabel lblVrtu = new JLabel("VRTU");
		lblVrtu.setForeground(new Color(245, 245, 245));
		lblVrtu.setFont(new Font("Dialog", Font.BOLD, 27));
		lblVrtu.setBackground(SystemColor.controlDkShadow);
		lblVrtu.setBounds(49, 208, 134, 55);
		frame.getContentPane().add(lblVrtu);
		
		JLabel lblMsft = new JLabel("MSFT");
		lblMsft.setForeground(new Color(245, 245, 245));
		lblMsft.setFont(new Font("Dialog", Font.BOLD, 27));
		lblMsft.setBackground(SystemColor.controlDkShadow);
		lblMsft.setBounds(49, 259, 134, 55);
		frame.getContentPane().add(lblMsft);
		
		JLabel lblGoogl = new JLabel("GOOGL");
		lblGoogl.setForeground(new Color(245, 245, 245));
		lblGoogl.setFont(new Font("Dialog", Font.BOLD, 27));
		lblGoogl.setBackground(SystemColor.controlDkShadow);
		lblGoogl.setBounds(49, 307, 134, 55);
		frame.getContentPane().add(lblGoogl);
		
		JLabel lblYhoo = new JLabel("YHOO");
		lblYhoo.setForeground(new Color(245, 245, 245));
		lblYhoo.setFont(new Font("Dialog", Font.BOLD, 27));
		lblYhoo.setBackground(SystemColor.controlDkShadow);
		lblYhoo.setBounds(49, 353, 134, 55);
		frame.getContentPane().add(lblYhoo);
		
		JLabel lblXlnx = new JLabel("XLNX");
		lblXlnx.setForeground(new Color(245, 245, 245));
		lblXlnx.setFont(new Font("Dialog", Font.BOLD, 27));
		lblXlnx.setBackground(SystemColor.controlDkShadow);
		lblXlnx.setBounds(49, 404, 134, 55);
		frame.getContentPane().add(lblXlnx);
		
		JLabel lblTsla = new JLabel("TSLA");
		lblTsla.setForeground(new Color(245, 245, 245));
		lblTsla.setFont(new Font("Dialog", Font.BOLD, 27));
		lblTsla.setBackground(SystemColor.controlDkShadow);
		lblTsla.setBounds(49, 454, 134, 55);
		frame.getContentPane().add(lblTsla);
		
		JLabel lblTxn = new JLabel("TXN");
		lblTxn.setForeground(new Color(245, 245, 245));
		lblTxn.setFont(new Font("Dialog", Font.BOLD, 27));
		lblTxn.setBackground(SystemColor.controlDkShadow);
		lblTxn.setBounds(49, 506, 134, 55);
		frame.getContentPane().add(lblTxn);
		
		JLabel lblFacebook = new JLabel("Facebook");
		lblFacebook.setForeground(new Color(245, 245, 245));
		lblFacebook.setFont(new Font("Dialog", Font.BOLD, 17));
		lblFacebook.setBackground(SystemColor.controlDkShadow);
		lblFacebook.setBounds(194, 156, 438, 55);
		frame.getContentPane().add(lblFacebook);
		
		JLabel lblVirtusaCorporation = new JLabel("Virtusa Corporation - common stock");
		lblVirtusaCorporation.setForeground(new Color(245, 245, 245));
		lblVirtusaCorporation.setFont(new Font("Dialog", Font.BOLD, 17));
		lblVirtusaCorporation.setBackground(SystemColor.controlDkShadow);
		lblVirtusaCorporation.setBounds(195, 212, 438, 55);
		frame.getContentPane().add(lblVirtusaCorporation);
		
		JLabel lblMicrosoftCorporation = new JLabel("Microsoft Corporation - Common Stock");
		lblMicrosoftCorporation.setForeground(new Color(245, 245, 245));
		lblMicrosoftCorporation.setFont(new Font("Dialog", Font.BOLD, 17));
		lblMicrosoftCorporation.setBackground(SystemColor.controlDkShadow);
		lblMicrosoftCorporation.setBounds(194, 263, 438, 55);
		frame.getContentPane().add(lblMicrosoftCorporation);
		
		JLabel lblGoogleInc = new JLabel("Google Inc. - Class A Common Stock");
		lblGoogleInc.setForeground(new Color(245, 245, 245));
		lblGoogleInc.setFont(new Font("Dialog", Font.BOLD, 17));
		lblGoogleInc.setBackground(SystemColor.controlDkShadow);
		lblGoogleInc.setBounds(195, 311, 438, 55);
		frame.getContentPane().add(lblGoogleInc);
		
		JLabel lblYahooInc = new JLabel("Yahoo! Inc. - Common Stock");
		lblYahooInc.setForeground(new Color(245, 245, 245));
		lblYahooInc.setFont(new Font("Dialog", Font.BOLD, 17));
		lblYahooInc.setBackground(SystemColor.controlDkShadow);
		lblYahooInc.setBounds(195, 357, 438, 55);
		frame.getContentPane().add(lblYahooInc);
		
		JLabel lblXilinx = new JLabel("Xilinx");
		lblXilinx.setForeground(new Color(245, 245, 245));
		lblXilinx.setFont(new Font("Dialog", Font.BOLD, 17));
		lblXilinx.setBackground(SystemColor.controlDkShadow);
		lblXilinx.setBounds(195, 408, 438, 55);
		frame.getContentPane().add(lblXilinx);
		
		JLabel lblTeslaMotors = new JLabel("Tesla Motors");
		lblTeslaMotors.setForeground(new Color(245, 245, 245));
		lblTeslaMotors.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTeslaMotors.setBackground(SystemColor.controlDkShadow);
		lblTeslaMotors.setBounds(195, 458, 438, 55);
		frame.getContentPane().add(lblTeslaMotors);
		
		JLabel lblTexasInstrumentsIncorporated = new JLabel("Texas Instruments Incorporated - Common Stock");
		lblTexasInstrumentsIncorporated.setForeground(new Color(245, 245, 245));
		lblTexasInstrumentsIncorporated.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTexasInstrumentsIncorporated.setBackground(SystemColor.controlDkShadow);
		lblTexasInstrumentsIncorporated.setBounds(195, 510, 438, 55);
		frame.getContentPane().add(lblTexasInstrumentsIncorporated);
		
		label = new JLabel("0.00");
		label.setForeground(new Color(245, 245, 245));
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(690, 152, 134, 55);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("0.00");
		label_1.setForeground(new Color(245, 245, 245));
		label_1.setFont(new Font("Dialog", Font.BOLD, 24));
		label_1.setBackground(SystemColor.controlDkShadow);
		label_1.setBounds(690, 208, 134, 55);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("0.00");
		label_2.setForeground(new Color(245, 245, 245));
		label_2.setFont(new Font("Dialog", Font.BOLD, 24));
		label_2.setBackground(SystemColor.controlDkShadow);
		label_2.setBounds(690, 259, 134, 55);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("0.00");
		label_3.setForeground(new Color(245, 245, 245));
		label_3.setFont(new Font("Dialog", Font.BOLD, 24));
		label_3.setBackground(SystemColor.controlDkShadow);
		label_3.setBounds(690, 307, 134, 55);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("0.00");
		label_4.setForeground(new Color(245, 245, 245));
		label_4.setFont(new Font("Dialog", Font.BOLD, 24));
		label_4.setBackground(SystemColor.controlDkShadow);
		label_4.setBounds(690, 357, 134, 55);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("0.00");
		label_5.setForeground(new Color(245, 245, 245));
		label_5.setFont(new Font("Dialog", Font.BOLD, 24));
		label_5.setBackground(SystemColor.controlDkShadow);
		label_5.setBounds(690, 408, 134, 55);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("0.00");
		label_6.setForeground(new Color(245, 245, 245));
		label_6.setFont(new Font("Dialog", Font.BOLD, 24));
		label_6.setBackground(SystemColor.controlDkShadow);
		label_6.setBounds(690, 454, 110, 55);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("0.00");
		label_7.setForeground(new Color(245, 245, 245));
		label_7.setFont(new Font("Dialog", Font.BOLD, 24));
		label_7.setBackground(SystemColor.controlDkShadow);
		label_7.setBounds(690, 506, 110, 55);
		frame.getContentPane().add(label_7);
		
		JLabel lblNewLabel_2 = new JLabel("---------------------------------------------------");
		lblNewLabel_2.setForeground(new Color(127, 255, 0));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 33));
		lblNewLabel_2.setBounds(49, 573, 763, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_8 = new JLabel("---------------------------------------------------");
		label_8.setForeground(new Color(127, 255, 0));
		label_8.setFont(new Font("Dialog", Font.BOLD, 33));
		label_8.setBounds(49, 121, 763, 15);
		frame.getContentPane().add(label_8);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(/*805, 120, 566, 636*/847,120,524,636);
		frame.getContentPane().add(scrollPane);
		
		
		
		
		
		//------------
		table = new JTable();
		    table.setFont(new java.awt.Font("Tahoma", 0, 16));
            table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Symbol", "Date", "Time", "Price"
            }
        ) 
        
            {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        //-----------
		
		table.setBackground(new Color(224,255,255));
		table.setFont(new Font("Dialog", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		
		
		//-----
		if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(50);
        }
        //------
		
		
		btnPriceCng = new JButton("Change Price Of An Item");
		btnPriceCng.setBackground(new Color(173, 255, 47));
		btnPriceCng.setBounds(49, 654, 242, 55);
		frame.getContentPane().add(btnPriceCng);
		
		btnList = new JButton("List  Stock Items");
		btnList.setBackground(new Color(173, 255, 47));
		btnList.setBounds(527, 654, 242, 55);
		frame.getContentPane().add(btnList);
		
	}
}

        
        
