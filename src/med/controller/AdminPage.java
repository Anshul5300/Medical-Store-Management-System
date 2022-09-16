package med.controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AdminPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Admin");
		frame.setBounds(700, 200, 597, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRoducts = new JButton("Products");
		btnRoducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRoducts.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRoducts.setBackground(new Color(252,252,252));		}
		});
		btnRoducts.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnRoducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductOptions.main(null);
				frame.dispose();
			}
		});
		
		btnRoducts.setBounds(105, 44, 138, 25);
		frame.getContentPane().add(btnRoducts);
		
		JButton btnBills = new JButton("Create Bill");
		btnBills.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnBills.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBills.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnBills.setBackground(new Color(252,252,252));		}
		});
		
		btnBills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateBill.main(null);
				frame.dispose();
			}
		});
		
		btnBills.setBounds(319, 44, 138, 25);
		frame.getContentPane().add(btnBills);
		
		JButton btnNewButton = new JButton("Bills");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(252,252,252));		}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayBills.main(null);
				frame.dispose();
			}
		});
		
		btnNewButton.setBounds(105, 108, 138, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOrders = new JButton("Orders");
		btnOrders.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnOrders.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnOrders.setBackground(new Color(252,252,252));		}
		});
		btnOrders.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnOrders.setBounds(319, 108, 138, 25);
		frame.getContentPane().add(btnOrders);
		
		JButton btnStock = new JButton("Stock");
		btnStock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnStock.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnStock.setBackground(new Color(252,252,252));		}
		});
		btnStock.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockOptions.main(null);
				frame.dispose();
				
			}
		});
		
		btnStock.setBounds(319, 180, 138, 25);
		frame.getContentPane().add(btnStock);
		
		JButton btnDealers = new JButton("Dealers");
		btnDealers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnDealers.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnDealers.setBackground(new Color(252,252,252));		}
		});
		btnDealers.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnDealers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DealerOptions.main(null);
				frame.dispose();
			}
		});
		
		btnDealers.setBounds(105, 180, 138, 25);
		frame.getContentPane().add(btnDealers);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnLogout.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnLogout.setBackground(new Color(252,252,252));		}
		});
		btnLogout.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow.main(null);
				frame.dispose();
			}
		});
		
		btnLogout.setBounds(319, 254, 138, 25);
		frame.getContentPane().add(btnLogout);
		
		JButton btnCompany = new JButton("Company");
		btnCompany.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCompany.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnCompany.setBackground(new Color(252,252,252));		}
		});
		btnCompany.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyOptions.main(null);
				frame.dispose();
			}
		});
		btnCompany.setBounds(105, 254, 138, 25);
		frame.getContentPane().add(btnCompany);
	}
}
