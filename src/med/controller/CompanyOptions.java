package med.controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class CompanyOptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyOptions window = new CompanyOptions();
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
	public CompanyOptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 558, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnEdit.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnEdit.setBackground(new Color(252,252,252));		}
		});
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditCompany.main(null);
				frame.dispose();
			}
		});
		btnEdit.setBounds(209, 222, 135, 31);
		frame.getContentPane().add(btnEdit);
		
		JButton btnAddNew = new JButton("Add New");
		btnAddNew.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnAddNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAddNew.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAddNew.setBackground(new Color(252,252,252));		}
		});
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewCompany.main(null);
				frame.dispose();
			}
		});
		btnAddNew.setBounds(209, 46, 135, 31);
		frame.getContentPane().add(btnAddNew);
		
		JButton btnViewRecords = new JButton("View Records");
		btnViewRecords.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnViewRecords.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnViewRecords.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnViewRecords.setBackground(new Color(252,252,252));		}
		});
		btnViewRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCompanies.main(null);
				frame.dispose();
			}
		});
		btnViewRecords.setBounds(209, 137, 135, 31);
		frame.getContentPane().add(btnViewRecords);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Sylfaen", Font.BOLD, 16));
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBack.setBackground(new Color(21,121,124));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnBack.setBackground(new Color(252,252,252));		}
		});
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(227, 337, 97, 25);
		frame.getContentPane().add(btnBack);
	}

}
