
public class LaptopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop Laptop1=new Laptop("Macbook","iOS",2018);
		System.out.println(Laptop1.LaptopBrand);
		
		Laptop Laptop2=new Laptop("Dell","Windows",2017);
		System.out.println(Laptop2.LaptopBrand);
		
		Laptop2.LaptopBrand="Lenovo";
		System.out.println(Laptop2.LaptopBrand);
	}

}
