import java.util.Scanner;
public class A2Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		double N=sc.nextDouble();
		double gr=N/144;
		double a=N%144;
		double dz=a/12;
		double lo=a%12;
		
		System.out.println("Your number of eggs is "+(int)gr+" gross "+(int)dz+" dozen and "+(int)lo);
	}

}
