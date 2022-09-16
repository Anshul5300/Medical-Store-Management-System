package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import med.servicelayer.MedService;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class NewCompany {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCompany window = new NewCompany();
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
	public NewCompany() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 496, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(229, 31, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCompanyId = new JLabel("Company ID :");
		lblCompanyId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCompanyId.setBounds(46, 34, 146, 19);
		frame.getContentPane().add(lblCompanyId);
		
		JLabel lblCompanyName = new JLabel("Company Name :");
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCompanyName.setBounds(46, 80, 146, 22);
		frame.getContentPane().add(lblCompanyName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(229, 81, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(229, 135, 216, 81);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCompanyAddress = new JLabel("Company Address :");
		lblCompanyAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCompanyAddress.setBounds(46, 135, 142, 22);
		frame.getContentPane().add(lblCompanyAddress);
		
		JLabel lblMobile = new JLabel("Mobile :");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMobile.setBounds(46, 237, 74, 22);
		frame.getContentPane().add(lblMobile);
		
		textField_3 = new JTextField();
		textField_3.setBounds(229, 238, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int co_id=Integer.parseInt(textField.getText());
				String co_name=textField_1.getText();
				String addr=textField_2.getText();
				int mobile=Integer.parseInt(textField_3.getText());
				MedService ms=new MedService();
				ms.addCompanyDetails(co_id, co_name, mobile, addr);
			}
		});
		btnAdd.setBounds(106, 339, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyOptions.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(268, 339, 97, 25);
		frame.getContentPane().add(btnCancel);
	}
}
