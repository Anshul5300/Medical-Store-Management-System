package med.controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class BillNo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillNo window = new BillNo();
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
	public BillNo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bill Number");
		frame.setBounds(700, 350, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBillNumber = new JLabel("Bill Number :");
		lblBillNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBillNumber.setBounds(32, 48, 100, 16);
		frame.getContentPane().add(lblBillNumber);
		
		JLabel lblArrival = new JLabel("Arrival :");
		lblArrival.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblArrival.setBounds(32, 101, 82, 16);
		frame.getContentPane().add(lblArrival);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Sylfaen", Font.BOLD, 16));
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
				 MainWindow.main(null);
			}
		});
		btnOk.setBounds(158, 172, 106, 31);
		frame.getContentPane().add(btnOk);
	}

}
