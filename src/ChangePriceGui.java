/*
Authors:E/16/200
		E/16/203
		E/16/217
Gui to change the price
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class ChangePriceGui extends JFrame{

	public JFrame frmChangePrice;
	public JTextField textField;
	public JTextField textField_1;
	
	public JButton btnSubmit;//submit button
	public JButton btnNewButton;//search button
	public JLabel lblNewLabel_1;//set the Symbol
	public JLabel lblFg;//set the name of the item
	public JLabel lblCurrentyUnavailable ;//set the price of the item

	
	/**
	 * Create the application.
	 */
	public ChangePriceGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChangePrice = new JFrame();
		frmChangePrice.setForeground(SystemColor.text);
		frmChangePrice.setTitle("Change Price");
		frmChangePrice.getContentPane().setEnabled(false);
		frmChangePrice.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 20));
		frmChangePrice.getContentPane().setBackground(SystemColor.controlDkShadow);
		frmChangePrice.setBackground(new Color(0, 0, 0));
		frmChangePrice.setBounds(100, 100, 979, 681);
		frmChangePrice.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmChangePrice.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Symbol");
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel.setBounds(52, 101, 247, 62);
		frmChangePrice.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 20));
		textField.setBounds(317, 113, 184, 48);
		frmChangePrice.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(173, 255, 47));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(590, 113, 170, 50);
		frmChangePrice.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 224));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(52, 260, 117, 55);
		frmChangePrice.getContentPane().add(lblNewLabel_1);
		
		lblFg = new JLabel("");
		lblFg.setForeground(new Color(255, 255, 224));
		lblFg.setFont(new Font("Dialog", Font.BOLD, 15));
		lblFg.setBounds(237, 260, 630, 55);
		frmChangePrice.getContentPane().add(lblFg);
		
		JLabel lblNewLabel_2 = new JLabel("Old Price  :");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 224));
		lblNewLabel_2.setBounds(52, 373, 145, 55);
		frmChangePrice.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter The New  Price");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 224));
		lblNewLabel_3.setBounds(52, 475, 247, 48);
		frmChangePrice.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(331, 475, 184, 48);
		frmChangePrice.getContentPane().add(textField_1);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSubmit.setBackground(new Color(173, 255, 47));
		btnSubmit.setBounds(603, 472, 170, 50);
		frmChangePrice.getContentPane().add(btnSubmit);
		
		lblCurrentyUnavailable = new JLabel("Currenty Unavailable");
		lblCurrentyUnavailable.setForeground(new Color(255, 255, 224));
		lblCurrentyUnavailable.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCurrentyUnavailable.setBounds(237, 373, 247, 55);
		frmChangePrice.getContentPane().add(lblCurrentyUnavailable);
		
		JLabel lblNewLabel_4 = new JLabel("Change The Price");
		lblNewLabel_4.setForeground(new Color(255, 255, 224));
		lblNewLabel_4.setFont(new Font("Dialog", Font.ITALIC, 40));
		lblNewLabel_4.setBounds(289, 12, 505, 48);
		frmChangePrice.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("_________________________________________________________________________________________________");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 224));
		lblNewLabel_5.setBounds(0, 175, 1016, 24);
		frmChangePrice.getContentPane().add(lblNewLabel_5);
		
		JLabel label = new JLabel("_________________________________________________________________________________________________");
		label.setForeground(new Color(255, 255, 224));
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(0, 58, 1016, 24);
		frmChangePrice.getContentPane().add(label);
	}
}
