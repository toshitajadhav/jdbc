package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fetchedData {

	public static void main(String[] args) {
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/toshita";
		String uname="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,uname,password);
		PreparedStatement ps=con.prepareStatement("select * from register");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name1=rs.getString("name");
			System.out.println(name1);
			String gender1=rs.getString("gender");
			System.out.println(gender1);
			String cityname1=rs.getString("cityname");
			System.out.println(cityname1);
		}
		con.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
