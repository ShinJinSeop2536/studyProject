
public class Main {

	public static void main(String[] args) {
		Box box  = new Box();
		box.set("ȫ�浿");					//String -> Object�� �ڵ�  Ÿ�� ��ȯ
		String name = (String)box.get();	//Object -> String ���� Ÿ�� ��ȭ
		
		box.set(new Apple());				//Apple -> Object�� �ڵ�  Ÿ�� ��ȯ
		Apple apple = (Apple)box.get();		//Object -> Apple�� ����  Ÿ�� ��ȯ
		
		BoxGeneric<String> bg = new BoxGeneric<String>();
		bg.set("Hello");
		String str = bg.get();
	
		BoxGeneric<Integer> bi = new BoxGeneric<Integer>();
		bi.set(10);
		int num = bi.get();
	
	}

}
