package Exception04;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int resul = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + resul);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű� ���� ���� �����մϴ�.");
			System.out.println("������");
			System.out.println("java tryCatchfinallyRuntimeExceptinEample num1 num2");
			return;
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϴ�.");
		} finally{
			System.out.println("�ٽ� ���� �ϼ���");
		}
	}

}
