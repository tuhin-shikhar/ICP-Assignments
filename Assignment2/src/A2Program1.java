import java.util.Scanner;
public class A2Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree in Celsius:");
		double cel=sc.nextDouble();
		double fah=(9.0/5)*cel+32;
		System.out.println(cel+" degree celsius is "+fah+" fahrenheit");

	}

}
