package Exception03;

public class ExecptionCodeEample01 {

	public static void main(String[] args) {
		try {
			Class clzz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���� ���� �ʽ��ϴ�.");
		}

	}

}
