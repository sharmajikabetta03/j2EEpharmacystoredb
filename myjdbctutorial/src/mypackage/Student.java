package mypackage;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Student {
	
	// public void  createDatabase()
	 

	 
	 public void createTable()
	 {
		 try
			{
				String url="jdbc:mysql://localhost:3306/SACHIN";
				String userName="root";
				String  password="root";
				
				Connection con=DriverManager.getConnection(url, userName,password);
				Statement st=con.createStatement();
		               
				 String query="CREATE TABLE student(sid int(10), sname varchar(100)";
				  st.execute(query);
				System.out.println("Table created successfully");
				
			} catch(Exception e)
			{
				e.printStackTrace();
			}

		 
	 }
	 
}


	 
	 
	 
	 
	 
	 
	 
	 


