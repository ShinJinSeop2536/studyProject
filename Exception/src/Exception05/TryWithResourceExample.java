package Exception05;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("file.txt"))
		{
			fis.read();
			throw new Exception(); //강제적으로 예외 발생시킴
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
	}

}
