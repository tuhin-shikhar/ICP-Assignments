import java.util.Scanner;
public class A3P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height of person:");
		double ht=sc.nextDouble();
		if(ht>=6)
			System.out.println("The person is tall.");
		else
			System.out.println("The person is not tall.");

	}

}
