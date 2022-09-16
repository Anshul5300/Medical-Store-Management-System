package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DealerOptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DealerOptions window = new DealerOptions();
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
	public DealerOptions() {
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
				EditDealer.main(null);
				frame.dispose();
			}
		});
		btnEdit.setBounds(23, 87, 97, 25);
		frame.getContentPane().add(btnEdit);
		
		JButton btnEnterNew = new JButton("Enter New");
		btnEnterNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewDealer.main(null);
				frame.dispose();
			}
		});
		btnEnterNew.setBounds(156, 87, 97, 25);
		frame.getContentPane().add(btnEnterNew);
		
		JButton btnAllDealers = new JButton("All Dealers");
		btnAllDealers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewDealers.main(null);
				frame.dispose();
			}
		});
		btnAllDealers.setBounds(296, 87, 97, 25);
		frame.getContentPane().add(btnAllDealers);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(156, 215, 97, 25);
		frame.getContentPane().add(btnBack);
	}

}
