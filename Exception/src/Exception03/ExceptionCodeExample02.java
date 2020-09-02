package Exception03;

public class ExceptionCodeExample02 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data1 = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
			System.out.println("실행방법");
			System.out.println("java tryCatchfinallyRuntimeExceptinEample num1 num2");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int resul =  value1+ value2;
			System.out.println(data1+"+"+data2+"="+resul);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할수 없습니다.");
		}finally {
			System.out.println("다시 실행 하세요");
		}
	}

}
