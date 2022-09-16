package med.controller;

import med.servicelayer.MedService;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class LoginWindow {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(700, 300, 451, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(108, 128, 78, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(198, 125, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(108, 168, 83, 16);
		frame.getContentPane().add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(198, 165, 116, 22);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String pwd=passwordField_1.getText();
			
			System.out.println("Name: "+username);
			System.out.println("Pass: "+pwd);
			
				if(username.equals("admin") && pwd.equals("123") )
				{
				    JOptionPane.showMessageDialog(null,"Login Successful");
			    AdminPage.main(null);
			    frame.dispose();
				}
				else if(username.equals("empl") && pwd.equals("456"))
				{
					JOptionPane.showMessageDialog(null,"Login Successful");
				    EmployeePage.main(null);
				    frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Login failed");
				}
				
			}

			
		});
		
		btnLogin.setBounds(166, 249, 97, 25);
		frame.getContentPane().add(btnLogin);
	}
}
