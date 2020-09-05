package Sample04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Sample01.User;

public class UserDao {
	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();
	}

	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();
		User user = new User();
		return user;
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
		return c;
	}
}
