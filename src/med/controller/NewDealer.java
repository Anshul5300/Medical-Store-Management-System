package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

import med.servicelayer.MedService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewDealer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewDealer window = new NewDealer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewDealer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 150, 537, 762);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int dealer_id=Integer.parseInt(textField.getText());
				String dealer_name=textField_1.getText();
				String addr=textField_2.getText();
				int mobile=Integer.parseInt(textField_3.getText());
				String city=textField_4.getText();
				String email=textField_5.getText();
				int co_id=Integer.parseInt(textField_6.getText());
				
				MedService ms=new MedService();
				ms.addDealerDetails(dealer_id,dealer_name,  addr, mobile,  city,  email, co_id);
			}
		});
		btnAdd.setBounds(124, 645, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DealerOptions.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(326, 645, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Dealer ID");
		lblNewLabel.setBounds(45, 43, 74, 33);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JLabel lblProductName = new JLabel("Dealer Name");
		lblProductName.setBounds(45, 101, 97, 25);
		frame.getContentPane().add(lblProductName);
		
		
		
		JLabel lblCompanyName = new JLabel("Address");
		lblCompanyName.setBounds(45, 165, 97, 25);
		frame.getContentPane().add(lblCompanyName);
		
		
		
		JLabel lblBatchNumber = new JLabel("Mobile");
		lblBatchNumber.setBounds(45, 316, 97, 25);
		frame.getContentPane().add(lblBatchNumber);
		
		
		
		JLabel lblRate = new JLabel("City");
		lblRate.setBounds(45, 402, 74, 25);
		frame.getContentPane().add(lblRate);
		
		
		
		JLabel lblMfgDate = new JLabel("Email");
		lblMfgDate.setBounds(45, 465, 80, 25);
		frame.getContentPane().add(lblMfgDate);
		
		
		
		JLabel lblExpiryDate = new JLabel("Company Id");
		lblExpiryDate.setBounds(45, 535, 80, 25);
		frame.getContentPane().add(lblExpiryDate);
		
		textField = new JTextField();
		textField.setBounds(286, 48, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(286, 102, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(286, 166, 204, 120);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(286, 317, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(286, 403, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(286, 466, 116, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(286, 535, 116, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		
		
		
		
	}
}
