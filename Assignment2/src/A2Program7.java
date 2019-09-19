import java.util.Scanner;
public class A2Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side=sc.nextDouble();
		double con=(3*1.732)/2;
		double area=con*side*side;
		System.out.println("The area of the hexagon is "+area);
		
	}

}
