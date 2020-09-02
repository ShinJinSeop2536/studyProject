package Exception04;

public class CatchOrderExample {

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
			System.out.println("실행 매개 값의 수가 부족합니다.");
			System.out.println("실행방법");
			System.out.println("java tryCatchfinallyRuntimeExceptinEample num1 num2");
			return;
		} catch (Exception e) {
			System.out.println("숫자로 변환할수 없습니다.");
		} finally {
			System.out.println("다시 실행 하세요");
		}
	}

}
