package How2J01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) {
		 execute("delete from hero where id = 1");
        
    }
	 public static void execute(String sql) {
	       
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	   
	        try (
	            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8",
	                "root", "123456");
	            Statement s = c.createStatement();             
	        )
	        {
	             
	        	
	            s.execute(sql);
	             
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
