package java2;
import java.util.Scanner;
//program to split ;
public class C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a string");
		String input=sc.nextLine();
		String s2[]=input.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
			s3=s2[i]+" "+s3;
		}
		System.out.println(s3);
	}

}
