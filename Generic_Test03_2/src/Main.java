
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p1 = new Pair<>(100, "홍길동");
		Pair<Integer, String> p2 = new Pair<>(100, "홍길동");
		boolean b1 = Util.compare(p1, p2);//구제적인 타입을 추정
		System.out.println(b1);
		if(b1) {
			System.out.println("논리적으로 동일합니다.");
		}
		else {
			System.out.println("논리적으로 동일하지 않았습니다..");
		}
		Pair<Integer, String> p3 = new Pair<>(100, "홍길동");
		Pair<Integer, String> p4 = new Pair<>(100, "길동");
		boolean b2 = Util.<Integer,String>compare(p3, p4);	//구제적인 타입을 명시적으로 지정
		System.out.println(b2);
		if(b2) {
			System.out.println("논리적으로 동일합니다.");
		}
		else {
			System.out.println("논리적으로 동일하지 않았습니다..");
		}
	}

}
