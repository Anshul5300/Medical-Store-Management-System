package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import med.servicelayer.MedService;

public class NewStock {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblProductId;
	private JLabel lblQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStock window = new NewStock();
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
	public NewStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 448, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int st_id=Integer.parseInt(textField.getText());
				int pro_id=Integer.parseInt(textField_1.getText());
				int quantity=Integer.parseInt(textField_2.getText());
				System.out.println(" In NewStock "+st_id);
				System.out.println(pro_id);
				System.out.println(quantity);
				MedService ms=new MedService();
				ms.addStockDetails(st_id,pro_id,quantity);
			}
		});
		btnAdd.setBounds(26, 325, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCaCel = new JButton("Cancel");
		btnCaCel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockOptions.main(null);
				frame.dispose();
			}
		});
		btnCaCel.setBounds(277, 325, 97, 25);
		frame.getContentPane().add(btnCaCel);
		
		JLabel lblStockId = new JLabel("Stock Id");
		lblStockId.setBounds(45, 46, 78, 25);
		frame.getContentPane().add(lblStockId);
		
		textField = new JTextField();
		textField.setBounds(249, 47, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(249, 121, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(249, 207, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblProductId = new JLabel("Product Id");
		lblProductId.setBounds(45, 124, 78, 32);
		frame.getContentPane().add(lblProductId);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(45, 210, 78, 19);
		frame.getContentPane().add(lblQuantity);
	}

}
