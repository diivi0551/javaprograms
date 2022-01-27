package java2;
import java.util.Scanner;
public class A {
//	write a program to reverse a string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		String s2="";
		for(int i=0;i<input.length();i++)
		{
			s2=input.charAt(i)+s2;
		}
		System.out.println(s2);
	}

}
