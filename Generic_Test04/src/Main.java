
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = Util.compare("a", "b");//String�� number Ÿ���� �ƴ�
		int reuslt =  Util.compare(10, 20);// int -> Integer(�ڵ�Boxing)
		System.out.println(reuslt);
		
		int result2 = Util.compare(4.5, 3); //double ->Double (�ڵ� Boxing)
		System.out.println(result2);
	}

}
