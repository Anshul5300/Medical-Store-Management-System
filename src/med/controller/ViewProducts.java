package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ViewProducts {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProducts window = new ViewProducts();
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
	public ViewProducts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 778, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductOptions.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(589, 581, 139, 54);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.setBounds(89, 581, 133, 54);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(12, 38, 736, 530);
		frame.getContentPane().add(table);
	}

}
