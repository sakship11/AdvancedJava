

import java.sql.*;
public class CreateStudentTable
{
	public static void main(String args[]) throws Exception
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver registered successfully!!!");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sakshi");
			System.out.println("Connection established successfully!!!");
			
			Statement stmt = con.createStatement();
			
			String query="create table StudentInfo(RollNo number(5),Name varchar(20), Percentage number)";
			
			stmt.execute(query);
			System.out.println("Table created Successfully!!!");
			con.close();
			
			
			
	}
}