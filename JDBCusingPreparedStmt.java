import java.sql.*;
public class JDBC {

	public static void main(String[] args) {

		String str = "imran imran";
		int count = 0;
		String Result = "";
		String strArray[] = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					count++;
					strArray[j] = "0";

				}
			}
			if (count > 1 && strArray[i] != "0") {
				Result = strArray[i];
				System.out.println(Result + "    " + count);
				  try { 
					  
				
				 String r = Result;
				 int c = count;
				 
				 String query = "insert into matchedWords (words,count)"
				 		+ " values(?,?)"
				 		+"ON DUPLICATE KEY UPDATE count=count+1";
				 
				 Class.forName("com.mysql.cj.jdbc.Driver");
				  
				 String url = "jdbc:mysql://localhost:3306/jdbc";
				 String uname = "root";
				 String pass = "password";
				 Connection con = DriverManager.getConnection(url,uname,pass);
				 PreparedStatement st = con.prepareStatement(query);
				 st.setString(1, r);
				 st.setInt(2, c);
				 
				int records_inserted =  st.executeUpdate();
				 System.out.println(r+" added");
				 st.close();
				 con.close();
				
 }
					  
				 catch(Exception e) 
				  { System.out.println(e);
					  }
			}
		}

	 
}

}
