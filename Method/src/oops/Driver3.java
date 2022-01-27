package oops;

public class Driver3 {

	public static void main(String[] args) {
		  G g1=new G();
		  System.out.println(g1.i);
		  System.out.println(g1.j);
		  
		  F f1=new F();
		  System.out.println(f1.i);
		  System.out.println(g1);
		  System.out.println(f1);
		 
		  F f2=g1;
		  System.out.println(f2);
		  System.out.println(f2.i);
		  System.out.println(f2.i);
				  
		

	}

}
