package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockOptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockOptions window = new StockOptions();
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
	public StockOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditStock.main(null);
				frame.dispose();
			}
		});
		btnEdit.setBounds(23, 76, 97, 25);
		frame.getContentPane().add(btnEdit);
		
		JButton btnAddNew = new JButton("Add new");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewStock.main(null);
				frame.dispose();
			}
		});
		btnAddNew.setBounds(163, 76, 97, 25);
		frame.getContentPane().add(btnAddNew);
		
		JButton btnAllStock = new JButton("All Stock");
		btnAllStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStock.main(null);
				frame.dispose();
			}
		});
		btnAllStock.setBounds(299, 76, 97, 25);
		frame.getContentPane().add(btnAllStock);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminPage.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(163, 215, 97, 25);
		frame.getContentPane().add(btnBack);
	}
}
