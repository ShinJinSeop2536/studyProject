package Sample02;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import Sample01.User;

public class UserDao {
	public void add(User user) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(
				"Jdbc:mysql://locolhost?springbook","spring","book");
		PreparedStatement ps  = c.prepareStatement(
				"insert into users(id, name, password)values (?,?,?)");
		ps.setString(1, user.getld());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.execute();
		ps.close();
		c.close();
	}
	public User get(String id) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c  =DriverManager.getConnection(
						"jdbc:mysql://localhost/springhook","spring","book");
		PreparedStatement ps = c.prepareStatement(
				"selct * from users where id =?");
		ps.setString(1,id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setld("id");
		user.setName("Name");
		user.setPassword("password");
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
	}
	
	
	

}
