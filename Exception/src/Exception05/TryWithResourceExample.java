package Exception05;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("file.txt"))
		{
			fis.read();
			throw new Exception(); //���������� ���� �߻���Ŵ
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
