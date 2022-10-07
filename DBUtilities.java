import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DBUtilities {
	
	private static Connection con  = null;
	public String str;
	
	private DBUtilities() {
		str = "I am in DBUtilies";
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "password";
		if(con == null) {
		con = DriverManager.getConnection(url,uname,pass);
		}
		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DBUtilities db = new DBUtilities();
		DBUtilities db2 = new DBUtilities();
		System.out.println("Hashcode of db is "+db.hashCode());
		System.out.println("Hashcode of db2 is "+db2.hashCode());
		
	}

}
