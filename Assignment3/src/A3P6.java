import java.util.Scanner;
public class A3P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();
		double g=a*d - b*c;
		double h=e*d - b*f;
		double i=a*f - e*c;
		if(g==0)
			System.out.println("The equation has no solution.");
		else
		{
		double x= h/g;
		double y= i/g;
		System.out.println("x is "+x+" and y is "+y);
		
		}

	}

}
