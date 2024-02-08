package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc1 {
public static void main(String[]args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("jdbc driver loaded successfully...");
		String url="jdbc:mysql://localhost:3306/toshita";
		String un="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,un,password);
	    PreparedStatement ps=con.prepareStatement("update register set cityname=? where name=?");
	    String cityname1="kolhapur";
	    String name1="bhairavi";
	    ps.setString(1,cityname1);
	    ps.setString(2,name1);
	    ps.executeUpdate();
	    ps.close();
	    
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	
}
}
