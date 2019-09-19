import java.util.Scanner;
public class A2Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int n=sc.nextInt();
		int x,y,z,a,sum;
		a=n%10; //2
		x=n/10; //93
		y=x/10; //9
		z=x%10; //3
		sum=a+y+z;
		System.out.println("The sum of the digits is "+sum);
	}

}
