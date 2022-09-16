package med.controller;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.s
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 400, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginWindow.main(null);
				frame.dispose();
			}
		});
		
		btnNewButton.setBounds(92, 84, 97, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    Onlineorder.main(null);
			    frame.dispose();
			}
		});
		btnOrder.setBounds(252, 84, 107, 53);
		frame.getContentPane().add(btnOrder);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About.main(null);
				frame.dispose();
			}
		});
		btnAbout.setBounds(27, 200, 97, 25);
		frame.getContentPane().add(btnAbout);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Help.main(null);
				frame.dispose();
			}
		});
		btnHelp.setBounds(166, 200, 97, 25);
		frame.getContentPane().add(btnHelp);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(311, 200, 97, 25);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Anshul\\Desktop\\New folder\\9657d3b2035ce0c.jpg"));
		lblNewLabel.setBounds(0, 0, 432, 253);
		frame.getContentPane().add(lblNewLabel);
		
	
	}
}
