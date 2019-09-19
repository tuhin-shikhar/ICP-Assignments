import java.util.Scanner;
public class A3P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, b and c of the quadratic equation");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=Math.pow(b,2)-4*a*c;
		double r1=(-b+Math.sqrt(d))/2*a;
		double r2=(-b-Math.sqrt(d))/2*a;
		if(d>=0)
		{
			System.out.println("Equation has two roots:");
			System.out.println(r1);
			System.out.println(r2);
		}
		else if(d==0)
		{
			System.out.println("Equation has one root:");
			System.out.println(r1);
		}
			
		else
		System.out.println("Equation has no roots");		
		}

}
