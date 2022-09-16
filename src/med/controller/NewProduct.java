package med.controller;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import med.servicelayer.MedService;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class NewProduct {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JDateChooser de;
	private JDateChooser da;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewProduct window = new NewProduct();
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
	public NewProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 150, 447, 761);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pro_id=Integer.parseInt(textField.getText());
				String pro_name=textField_1.getText();
				String co_name=textField_2.getText();
				String batch_no=textField_3.getText();
				int rate=Integer.parseInt(textField_4.getText());
				String pro_type=textField_7.getText();
				//Date mfg_date=null,exp_date=null;
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date=sdf.format(de.getDate());
				

				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
				String date1=sdf1.format(da.getDate());
				
				/*try
				{
					mfg_date = new SimpleDateFormat("dd/MM/yyyy").parse(textField_5.getText());
					exp_date=new SimpleDateFormat("dd/MM/yyyy").parse(textField_6.getText());
				}
				catch (ParseException e1) 
				{
					e1.printStackTrace();
				}*/
				
				
				MedService ms=new MedService();
				ms.addProductDetails( pro_id, pro_name, co_name, batch_no, rate, pro_type,date,date1);
			}
		});
		btnAdd.setBounds(22, 676, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(294, 676, 97, 25);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductOptions.main(null);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("Product ID");
		lblNewLabel.setBounds(45, 43, 74, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(255, 48, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(45, 101, 97, 25);
		frame.getContentPane().add(lblProductName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(255, 102, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(45, 165, 97, 25);
		frame.getContentPane().add(lblCompanyName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(255, 166, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBatchNumber = new JLabel("Batch Number");
		lblBatchNumber.setBounds(45, 240, 97, 25);
		frame.getContentPane().add(lblBatchNumber);
		
		textField_3 = new JTextField();
		textField_3.setBounds(255, 241, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(45, 310, 74, 25);
		frame.getContentPane().add(lblRate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(255, 311, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMfgDate = new JLabel("MFG Date");
		lblMfgDate.setBounds(45, 465, 80, 25);
		frame.getContentPane().add(lblMfgDate);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date");
		lblExpiryDate.setBounds(45, 535, 80, 25);
		frame.getContentPane().add(lblExpiryDate);
		
		JLabel lblProductType = new JLabel("Product Type");
		lblProductType.setBounds(45, 391, 97, 25);
		frame.getContentPane().add(lblProductType);
		
		textField_7 = new JTextField();
		textField_7.setBounds(255, 392, 116, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JDateChooser de = new JDateChooser();
		de.setDateFormatString("MMM,d,yyyy");
		de.setBounds(206, 468, 149, 22);
		frame.getContentPane().add(de);
		
		JDateChooser da = new JDateChooser();
		da.setBounds(206, 538, 147, 22);
		frame.getContentPane().add(da);
	}
}
