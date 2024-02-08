package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("jdbc driver loaded successfully...");
			String url="jdbc:mysql://localhost:3306/toshita";
			String un="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,un,password);
			PreparedStatement ps=con.prepareStatement("delete from register where name=?");
			String name1="bhairavi";
			ps.setString(1,name1);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
