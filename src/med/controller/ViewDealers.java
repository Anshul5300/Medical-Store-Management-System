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

public class ViewDealers {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDealers window = new ViewDealers();
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
	public ViewDealers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 350, 796, 691);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DealerOptions.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(566, 571, 143, 49);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dbName="NewtownMed";
				String driverName="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/";
				try{
					Class.forName(driverName);
					String query="select * from dealerdetails";
					Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
					Statement st=(Statement) con.createStatement();
					
					
					ResultSet rs=st.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}});
		btnNewButton.setBounds(109, 571, 135, 48);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(12, 45, 754, 488);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("Dealer ID");
		lblNewLabel.setBounds(23, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDealerName = new JLabel("Dealer Name");
		lblDealerName.setBounds(119, 26, 84, 16);
		frame.getContentPane().add(lblDealerName);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(226, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile ");
		lblNewLabel_2.setBounds(337, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setBounds(442, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email id");
		lblNewLabel_4.setBounds(547, 26, 56, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Company id");
		lblNewLabel_5.setBounds(655, 26, 84, 16);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
