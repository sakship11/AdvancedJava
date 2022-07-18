
//Develop a program to update name of a student from Jack to John.
import java.sql.*;
 
public class UpdateQuery1
{
	public static void main( String args[] ) throws SQLException
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	   
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sakshi");
	  
			if(con != null)
				System.out.println("Connection established successfully");
			else
				System.out.println("Connection not established successfully");
	 
				PreparedStatement stmt=con.prepareStatement("update student set name='John'  where name='jack'");  
				//1 specifies the first parameter in the query i.e. name  
				//stmt.setInt(1,1); 
				//stmt.setString(2,"John");	
				//stmt.setFloat(3, 89.90f);
  
				int i=stmt.executeUpdate();  
				System.out.println(i+" records updated");  
				con.close();
		}
		catch(Exception w)
		{
			System.out.print(w);
		}
	}
}