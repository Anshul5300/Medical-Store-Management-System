package med.newtownDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class NewtownDB {

	public static Connection getConnection() 
			  throws Exception
			  {
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection  conn = DriverManager.getConnection(
						  "jdbc:mysql://localhost:3306/NewtownMed",
						  "root","root");
				  
				  return conn;
			  }
}
