import java.sql.*;
public class JDBC {

	public static void main(String[] args) {

		String str = "khan khan";
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
					  
				 Class.forName("com.mysql.cj.jdbc.Driver");
					  
				 String url = "jdbc:mysql://localhost:3306/jdbc";
				 String uname = "root";
				 String pass = "password";
				 
				 String query = "insert into matchedWords (words,count)"
				 		+ " values("+"'"+Result+"'"+","+count+")"
				 		+"ON DUPLICATE KEY UPDATE count=count+1";
				 
				 
				 Connection con = DriverManager.getConnection(url,uname,pass);
				 Statement st = con.createStatement();
				 
				 st.executeUpdate(query);
				 
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
