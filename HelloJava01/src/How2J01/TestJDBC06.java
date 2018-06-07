package How2J01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC06 {
	 public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	  
	        String sql = "insert into user values(null,?,?)";
	        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8",
	                   "root", "123456");
	            // 根据sql语句创建PreparedStatement
	            PreparedStatement ps = c.prepareStatement(sql);
	        ) {
	             
	            // 设置参数
	            ps.setString(1, "admin");
	            ps.setString(2, "123456");
	            // 执行
	            ps.execute();
	  
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    
	    }
}
