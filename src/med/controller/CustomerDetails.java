package med.controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;

public class CustomerDetails {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDetails window = new CustomerDetails();
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
	public CustomerDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 200, 450, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(63, 38, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblMobileNo = new JLabel("Mobile No. :");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobileNo.setBounds(63, 81, 97, 16);
		frame.getContentPane().add(lblMobileNo);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(63, 132, 70, 16);
		frame.getContentPane().add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(190, 35, 187, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 78, 187, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 132, 187, 95);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDeliveryOptions = new JLabel("Delivery Option:");
		lblDeliveryOptions.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryOptions.setBounds(63, 278, 119, 22);
		frame.getContentPane().add(lblDeliveryOptions);
		
		JList list = new JList();
		list.setBounds(205, 417, 123, -136);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(215, 308, 13, -13);
		frame.getContentPane().add(list_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCancel.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnCancel.setBackground(new Color(252,252,252));		}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(63, 435, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnOk.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnOk.setBackground(new Color(252,252,252));		}
		});
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				BillNo.main(null);
				frame.dispose();
				
			}

			
		});
		btnOk.setBounds(280, 435, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Instant");
		comboBox.addItem("Within 3 days");
		comboBox.addItem("Within a week");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(190, 279, 169, 22);
		frame.getContentPane().add(comboBox);
	}
}
