
//Write a program to delete a record from a table.

import java.sql.*;
 
public class DeleteQuery
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
	 
				Statement st = con.createStatement();
	 
				String qry  = "Delete from student where rollno = 3 ";

				int count = st.executeUpdate(qry);
	 
				System.out.println( count +" Record Deleted Successfully");     
	 
				st.close();
				con.close();
		}
		catch(Exception w)
		{
			System.out.print(w);
		}
	}
}
