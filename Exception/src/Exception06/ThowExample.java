package Exception06;

public class ThowExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class clzz = Class.forName("java.lang.String2");
	}

}
