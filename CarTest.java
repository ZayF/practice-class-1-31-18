
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car carl=new Car("Ford",15000,1992);
		System.out.println(carl.carBrand);
		
		Car car2=new Car("Toyota",10000,2000);
		System.out.println(car2.carBrand);
		
		car2.carBrand="Nissan";
		System.out.println(car2.carBrand);
	}

}
