import java.util.Scanner;
public class A2Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double pounds=sc.nextDouble();
		System.out.println("Enter height in inches: ");
		double height=sc.nextDouble();
		double kg=pounds*0.45359237;
		double ht=height*0.0254;
		double bmi=kg/(ht*ht);
		System.out.println("BMI is "+bmi);
	}

}
