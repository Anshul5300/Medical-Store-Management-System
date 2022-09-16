package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalOrder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalOrder window = new FinalOrder();
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
	public FinalOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Final Order");
		frame.setBounds(800, 350, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectMedicines.main(null);
				frame.dispose();
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(23, 196, 97, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Onlineorder.main(null);
				frame.dispose();
			}
		});
		btnCancel.setFont(btnCancel.getFont().deriveFont(btnCancel.getFont().getStyle() | Font.BOLD));
		btnCancel.setBounds(161, 196, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JButton btnFinalize = new JButton("Finalize");
		btnFinalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDetails.main(null);
				frame.dispose();
			}
		});
		btnFinalize.setFont(btnFinalize.getFont().deriveFont(btnFinalize.getFont().getStyle() | Font.BOLD));
		btnFinalize.setBounds(301, 196, 97, 25);
		frame.getContentPane().add(btnFinalize);
	}

}
