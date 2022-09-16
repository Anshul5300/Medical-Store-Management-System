package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import med.servicelayer.MedService;

import java.awt.Font;

public class EditProduct {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProduct window = new EditProduct();
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
	public EditProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 150, 452, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pro_id=Integer.parseInt(textField.getText());
				String pro_name=textField_1.getText();
				String co_name=textField_2.getText();
				String batch_no=textField_3.getText();
				int rate=Integer.parseInt(textField_4.getText());
				String pro_type=textField_5.getText();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=sdf.format(de.getDate());
				

				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
				String date1=sdf1.format(da.getDate());
				/*Date mfg_date=null,exp_date=null;
				try
				{
					mfg_date = new SimpleDateFormat("dd/MM/yyyy").parse(textField_6.getText());
					exp_date=new SimpleDateFormat("dd/MM/yyyy").parse(textField_7.getText());
				}
				catch (ParseException e1) 
				{
					e1.printStackTrace();
				}*/
				
				
				MedService ms=new MedService();
				ms.editProductDetails( pro_id, pro_name, co_name, batch_no, rate, pro_type, date, date1);
			}
		});
		btnSave.setBounds(45, 628, 97, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductOptions.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(291, 628, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Product ID");
		lblNewLabel.setBounds(45, 43, 74, 33);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(45, 147, 97, 25);
		frame.getContentPane().add(lblProductName);
		
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(45, 208, 97, 25);
		frame.getContentPane().add(lblCompanyName);
		
		
		JLabel lblBatchNumber = new JLabel("Batch Number");
		lblBatchNumber.setBounds(45, 271, 97, 25);
		frame.getContentPane().add(lblBatchNumber);
		
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(45, 338, 74, 25);
		frame.getContentPane().add(lblRate);
		
		
		JLabel lblMfgDate = new JLabel("MFG Date");
		lblMfgDate.setBounds(45, 465, 80, 25);
		frame.getContentPane().add(lblMfgDate);
		
		
		
		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(45, 535, 80, 25);
		frame.getContentPane().add(lblExpiryDate);
		
		
		
		JLabel lblProductType = new JLabel("Product Type");
		lblProductType.setBounds(45, 391, 97, 25);
		frame.getContentPane().add(lblProductType);
		
		
		textField = new JTextField();
		textField.setBounds(232, 48, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterNewDetails = new JLabel("ENTER NEW DETAILS");
		lblEnterNewDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterNewDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNewDetails.setBounds(91, 89, 229, 36);
		frame.getContentPane().add(lblEnterNewDetails);
		
		textField_1 = new JTextField();
		textField_1.setBounds(232, 148, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 209, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(232, 272, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(232, 339, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(232, 392, 116, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(232, 466, 116, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(232, 536, 116, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
	}

}
