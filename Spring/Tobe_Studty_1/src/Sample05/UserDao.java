package Sample05;

import java.sql.Connection;
import java.sql.SQLException;

import Sample01.User;

public abstract class UserDao {
	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();
	}

	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();
		User user = new User();
		return user;
	}
	public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
}
