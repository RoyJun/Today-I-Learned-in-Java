package exam03_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setKing(new Tv());
		product1.setModel("����ƮTV");
		Tv tv = product1.getKing();
		String tvModel = product1.getModel();
		
		Product<Car,String> product2 =new Product<>();
		product2.setKing(new Car());
		product2.setModel("����");
		Car car = product2.getKing();
		String carModel = product2.getModel();
		
	}

}
