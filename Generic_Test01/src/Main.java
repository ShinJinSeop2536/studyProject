
public class Main {

	public static void main(String[] args) {
		Box box  = new Box();
		box.set("홍길동");					//String -> Object로 자동  타입 변환
		String name = (String)box.get();	//Object -> String 강제 타입 변화
		
		box.set(new Apple());				//Apple -> Object로 자동  타입 변환
		Apple apple = (Apple)box.get();		//Object -> Apple로 강제  타입 변환
		
		BoxGeneric<String> bg = new BoxGeneric<String>();
		bg.set("Hello");
		String str = bg.get();
	
		BoxGeneric<Integer> bi = new BoxGeneric<Integer>();
		bi.set(10);
		int num = bi.get();
	
	}

}
