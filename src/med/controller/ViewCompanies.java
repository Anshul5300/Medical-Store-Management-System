package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import net.proteanit.sql.DbUtils;
import javax.swing.JLabel;

public class ViewCompanies {

	private JFrame frame;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCompanies window = new ViewCompanies();
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
	public ViewCompanies() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 787, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyOptions.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(562, 603, 162, 75);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dbName="NewtownMed";
				String driverName="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/";
				try{
					Class.forName(driverName);
					String query="select * from companydetails";
					Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
					Statement st=(Statement) con.createStatement();
					
					
					ResultSet rs=st.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(43, 603, 127, 75);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(12, 43, 745, 532);
		frame.getContentPane().add(table);
		
		lblNewLabel = new JLabel("Company id");
		lblNewLabel.setBounds(61, 26, 81, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Company name");
		lblNewLabel_1.setBounds(222, 26, 104, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(422, 26, 93, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Mobile");
		lblNewLabel_3.setBounds(627, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
