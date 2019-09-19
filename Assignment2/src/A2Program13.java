import java.util.Scanner;
public class A2Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many minutes?");
		int m=sc.nextInt();
		int y,d,a;
		d=m/(60*24);
		y=d/365;
		a=d%365;
		System.out.println(m+" minutes is approximately "+y+" years and "+a+" days");
	}

}
