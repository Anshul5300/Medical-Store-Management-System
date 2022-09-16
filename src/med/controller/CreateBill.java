package med.controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CreateBill {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBill window = new CreateBill();
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
	public CreateBill() {
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
		
		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNext.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNext.setBackground(new Color(252,252,252));		}
		});
		btnNext.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNext.setBounds(48, 211, 97, 29);
		frame.getContentPane().add(btnNext);
		
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
		btnCancel.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage.main(null);
				frame.dispose();
			}
		});
		btnCancel.setBounds(264, 211, 97, 29);
		frame.getContentPane().add(btnCancel);
	}

}
