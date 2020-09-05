package Sample05;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//D사 DB Connection 생성 코드
		return null;
	}

}
