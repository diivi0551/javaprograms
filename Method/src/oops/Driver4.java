package oops;

public class Driver4 {

	public static void main(String[] args) {

		I i1=new I();
		i1.lights();

		H h1=new H();
		h1.lights();

		H h2=i1;
		h2.lights();



	}

}
