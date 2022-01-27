package programs;

public class Bike {
	String name;
	String brand;
	int cc;
	
	Bike(String name, String brand, int cc)
	{
		this.name=name;
		this.brand=brand;
		this.cc=cc;
		
		System.out.println("NAME:" +this.name);
		System.out.println("BRAND:" +this.brand);
		System.out.println("CC:"+this.cc);
	}

	public static void main(String[] args) {
		new Bike("duke","ktm",390);
		new Bike("pulsar","bajaj",200);
	
		
		

	}

}
