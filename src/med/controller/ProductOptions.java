package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductOptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductOptions window = new ProductOptions();
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
	public ProductOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 481, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditProduct.main(null);
				frame.dispose();
			}
		});
		btnEdit.setBounds(12, 75, 120, 25);
		frame.getContentPane().add(btnEdit);
		
		JButton btnNew = new JButton("Enter New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewProduct.main(null);
				frame.dispose();
			}
		});
		btnNew.setBounds(174, 75, 111, 25);
		frame.getContentPane().add(btnNew);
		
		JButton btnViewProducts = new JButton("View Products");
		btnViewProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewProducts.main(null);
				frame.dispose();
			}
		});
		btnViewProducts.setBounds(323, 75, 128, 25);
		frame.getContentPane().add(btnViewProducts);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(188, 208, 97, 25);
		frame.getContentPane().add(btnBack);
	}

}
