/*
Authors:E/16/200
		E/16/203
		E/16/217
Gui for the client
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ClientGui {

	public JFrame frmClient;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JButton btnOk;
	public JButton btnGo;
	public JLabel lblCurrentlyUnavailable;
	public JLabel lblCurrentlyUnavailable_1;
	public JLabel lblCurrentlyUnavailable_2;
	public JButton btnConfirm;
	public JButton btnNewButton;
	public JLabel label_3;

	

	/**
	 * Create the application.
	 */
	public ClientGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClient = new JFrame();
		frmClient.getContentPane().setBackground(new Color(47, 79, 79));
		frmClient.setBackground(new Color(173, 255, 47));
		frmClient.setTitle("Client");
		frmClient.setBounds(100, 100, 1017, 660);
		frmClient.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmClient.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Place Your  Bid");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setBounds(318, 25, 371, 47);
		frmClient.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Name");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 224));
		lblNewLabel_1.setBounds(27, 120, 179, 27);
		frmClient.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setBounds(247, 111, 280, 36);
		frmClient.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.setBackground(new Color(173, 255, 47));
		btnOk.setBounds(594, 110, 69, 36);
		frmClient.getContentPane().add(btnOk);
		
		JLabel label = new JLabel("_____________________________________________________________________________________________________________________________________________________________________");
		label.setForeground(new Color(173, 255, 47));
		label.setBackground(new Color(47, 79, 79));
		label.setBounds(0, 68, 993, 15);
		frmClient.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________________________________________________________________________________________________________");
		label_1.setForeground(new Color(173, 255, 47));
		label_1.setBackground(new Color(47, 79, 79));
		label_1.setBounds(0, 159, 993, 15);
		frmClient.getContentPane().add(label_1);
		
		JLabel lblEnterSymbol = new JLabel("Enter Symbol");
		lblEnterSymbol.setForeground(new Color(255, 255, 224));
		lblEnterSymbol.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterSymbol.setBounds(27, 205, 155, 27);
		frmClient.getContentPane().add(lblEnterSymbol);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 196, 145, 36);
		frmClient.getContentPane().add(textField_1);
		
		btnGo = new JButton("Go");
		btnGo.setEnabled(false);
		btnGo.setBackground(new Color(173, 255, 47));
		btnGo.setBounds(401, 186, 69, 51);
		frmClient.getContentPane().add(btnGo);
		
		JLabel lblSymbol = new JLabel("Symbol");
		lblSymbol.setForeground(new Color(255, 255, 224));
		lblSymbol.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSymbol.setBounds(27, 259, 155, 27);
		frmClient.getContentPane().add(lblSymbol);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 224));
		lblName.setFont(new Font("Dialog", Font.BOLD, 18));
		lblName.setBounds(27, 298, 155, 27);
		frmClient.getContentPane().add(lblName);
		
		JLabel lblCurrent = new JLabel("Current  Price");
		lblCurrent.setForeground(new Color(255, 255, 224));
		lblCurrent.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCurrent.setBounds(27, 337, 155, 27);
		frmClient.getContentPane().add(lblCurrent);
		
		lblCurrentlyUnavailable = new JLabel("Currently Unavailable");
		lblCurrentlyUnavailable.setForeground(new Color(255, 255, 224));
		lblCurrentlyUnavailable.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCurrentlyUnavailable.setBounds(247, 259, 241, 27);
		frmClient.getContentPane().add(lblCurrentlyUnavailable);
		
		lblCurrentlyUnavailable_1 = new JLabel("Currently Unavailable");
		lblCurrentlyUnavailable_1.setForeground(new Color(255, 255, 224));
		lblCurrentlyUnavailable_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCurrentlyUnavailable_1.setBounds(247, 298, 573, 27);
		frmClient.getContentPane().add(lblCurrentlyUnavailable_1);
		
		lblCurrentlyUnavailable_2 = new JLabel("Currently Unavailable");
		lblCurrentlyUnavailable_2.setForeground(new Color(255, 255, 224));
		lblCurrentlyUnavailable_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCurrentlyUnavailable_2.setBounds(247, 337, 223, 27);
		frmClient.getContentPane().add(lblCurrentlyUnavailable_2);
		
		JLabel label_2 = new JLabel("_____________________________________________________________________________________________________________________________________________________________________");
		label_2.setForeground(new Color(173, 255, 47));
		label_2.setBackground(new Color(47, 79, 79));
		label_2.setBounds(0, 376, 993, 15);
		frmClient.getContentPane().add(label_2);
		
		JLabel lblEnterYourNew = new JLabel("Enter Your New Price");
		lblEnterYourNew.setForeground(new Color(255, 255, 224));
		lblEnterYourNew.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterYourNew.setBounds(27, 418, 255, 27);
		frmClient.getContentPane().add(lblEnterYourNew);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(300, 414, 188, 36);
		frmClient.getContentPane().add(textField_2);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setEnabled(false);
		btnConfirm.setBackground(new Color(173, 255, 47));
		btnConfirm.setBounds(546, 407, 108, 51);
		frmClient.getContentPane().add(btnConfirm);
		
		btnNewButton = new JButton("QUIT");
		btnNewButton.setForeground(new Color(255, 255, 224));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setBounds(406, 517, 141, 58);
		frmClient.getContentPane().add(btnNewButton);
		
		label_3 = new JLabel("");
		label_3.setForeground(new Color(255, 255, 224));
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		label_3.setBounds(547, 186, 81, 46);
		frmClient.getContentPane().add(label_3);
	}

}
