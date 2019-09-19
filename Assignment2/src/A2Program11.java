import java.util.Scanner;
public class A2Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double r=sc.nextDouble();
		System.out.println("Enter number of years: ");
		double t=sc.nextDouble();
		double c=Math.pow(1+(r/12),t*12);
		double acc=p*c;
		System.out.println("Accumulated value is $"+acc);
	}

}
