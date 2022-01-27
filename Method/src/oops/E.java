package oops;

public class E extends D{
	E(String s)
	{
		this(10);
		System.out.println(s);
	}
	E(double a)
	{
		super(10);
		System.out.println("10.2");

	}

}
