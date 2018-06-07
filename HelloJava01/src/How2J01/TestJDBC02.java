package How2J01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC02 {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8",
                "root", "123456");
        		Statement s = c.createStatement();) {
 
            String sql = "select * from hero";
 
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                int hp = rs.getInt("hp");
                int mp = rs.getInt(4);
                int gold = rs.getInt(5);
                System.out.printf("%d\t %s\t %d\t %d\t %d%n", id, name, hp, mp, gold);
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
