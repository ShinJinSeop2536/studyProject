package Sample05;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//D�� DB Connection ���� �ڵ�
		return null;
	}

}
