
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = Util.compare("a", "b");//String은 number 타입이 아님
		int reuslt =  Util.compare(10, 20);// int -> Integer(자동Boxing)
		System.out.println(reuslt);
		
		int result2 = Util.compare(4.5, 3); //double ->Double (자동 Boxing)
		System.out.println(result2);
	}

}
