package Hotel;
import java.sql.*;
public class Database1 {
      Statement stmt;
      Connection conn;
	public Database1()  {
		// TODO Auto-generated method stub
       try {
    	  // Class.forName("con.mysql.jdbc.Driver");
    	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","Root@123#Sayali");
    	    stmt=conn.createStatement();
       }
       catch(SQLException ex){
    	   
       }
	}
       public static void main(String[] args) {
    	   new Database1();
	}

}
