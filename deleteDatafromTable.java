import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		int result = delete_data("imran");
		if(result > 0) {
			System.out.println(result +" record/s deleted...");
		}
		else {
			System.out.println("No Record Found...");
		}
		 
		 }
	
	public static int delete_data(String word) throws SQLException, ClassNotFoundException {
		Connection con =  DBUtilities.getConnection();
		String query = "DELETE FROM matchedwords WHERE words= ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, word);
		int rows = ps.executeUpdate();
		return rows;
	}

}
