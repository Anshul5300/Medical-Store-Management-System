package med.controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import med.servicelayer.MedService;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class EditCompany {

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
					EditCompany window = new EditCompany();
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
	public EditCompany() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 250, 526, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCompanyId = new JLabel("Company ID :");
		lblCompanyId.setBounds(46, 34, 146, 19);
		lblCompanyId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblCompanyId);
		
		JLabel lblCompanyName = new JLabel("Company Name :");
		lblCompanyName.setBounds(46, 147, 146, 22);
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblCompanyName);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(46, 209, 113, 30);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblNewLabel = new JLabel("Mobile :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(46, 305, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(274, 33, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(274, 148, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(274, 214, 179, 71);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(274, 303, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int co_id=Integer.parseInt(textField.getText());
				String co_name=textField_1.getText();
				String addr=textField_2.getText();
				int mobile=Integer.parseInt(textField_3.getText());
				MedService ms=new MedService();
				ms.editCompanyDetails(co_id, co_name, mobile, addr);
			}
		});
		btnSave.setBounds(119, 367, 97, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyOptions.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(271, 367, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblEnterNewDetails = new JLabel("ENTER NEW DETAILS");
		lblEnterNewDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNewDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterNewDetails.setBounds(119, 84, 271, 30);
		frame.getContentPane().add(lblEnterNewDetails);
		
		
	}
}
