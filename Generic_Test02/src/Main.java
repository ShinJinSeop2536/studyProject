
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<TV, String> p1 = new Product<TV, String>();
		p1.setKind(new TV());
		p1.setModel("����ƮTV");
		TV t1 = p1.getKind();
		String  name =  p1.getModel();
		
		Product<Car, Integer> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel(5);
		Car c1 = p2.getKind();
		int num =  p2.getModel();
		
	}

}
