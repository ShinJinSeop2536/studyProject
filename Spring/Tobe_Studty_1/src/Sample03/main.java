package Sample03;

import java.sql.SQLException;

import Sample01.User;
import Sample02.UserDao;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setld("whiteship");
		user.setName("백기선");
		user.setName("married");
		
		dao.add(user);
		
		System.out.println(user.getld()+"등록 성공");
		
		User user2 = dao.get(user.getld());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getld()+"조회 성공");
	}

}
