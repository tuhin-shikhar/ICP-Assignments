import java.util.Scanner;
public class A2Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		System.out.println("Enter x3 and y3: ");
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		double diff=Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		double a=Math.sqrt(diff);
		diff=Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2);
		double b=Math.sqrt(diff);
		diff=Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2);
		double c=Math.sqrt(diff);
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangel is "+area);

	}

}
