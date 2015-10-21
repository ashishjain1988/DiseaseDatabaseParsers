package Disease_Database.parsers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
	public static void main(String[] args) {
		
	}
	
	public static Connection getJDBCConnector() throws SQLException
	{
		Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost/disease?user=root&password=root");
		return con;
	}
}
