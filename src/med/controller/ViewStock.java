package med.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import med.newtownDAO.NewtownDB;
import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.awt.Color;
import javax.swing.JLabel;
public class ViewStock {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStock window = new ViewStock();
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
	public ViewStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 973, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*try
		{
			Connection con=NewtownDB.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from stockdetails;");
			while(rs.next())
			{
				System.out.println("");
			}
				
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockOptions.main(null);
				frame.dispose();
			}
		});
		btnBack.setBounds(772, 637, 97, 25);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dbName="NewtownMed";
				String driverName="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/";
				try{
					Class.forName(driverName);
					String query="select * from stockdetails";
					Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
					Statement st=(Statement) con.createStatement();
					
					
					ResultSet rs=st.executeQuery(query);
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			}
		);
		btnNewButton.setBounds(37, 637, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		table_1 = new JTable();
		table_1.setBounds(12, 64, 931, 564);
		frame.getContentPane().add(table_1);
		
		JLabel lblNewLabel = new JLabel("stock id");
		lblNewLabel.setBounds(12, 44, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("product id");
		lblNewLabel_1.setBounds(322, 44, 69, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("quantity");
		lblNewLabel_2.setBounds(651, 44, 56, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}
