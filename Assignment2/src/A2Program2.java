import java.util.Scanner;
public class A2Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and length of the cylinder:");
		double r=sc.nextDouble();
		double l=sc.nextDouble();
		double pi=3.141;
		double area=r*r*pi;
		double vol=area*l;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+vol);
	}

}
