import java.util.Scanner;
public class A3P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coordinates:");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		if(x==0)
			System.out.println("("+x+"),("+y+") is on the y-axis");
		else if(y==0)
			System.out.println("("+x+"),("+y+") is on the x-axis");
		else if(x>0&&y>0)
			System.out.println("("+x+"),("+y+") is in quadrant I");
		else if(x<0&&y>0)
			System.out.println("("+x+"),("+y+") is in quadrant II");
		else if(x<0&&y<0)
			System.out.println("("+x+"),("+y+") is in quadrant III");
		else if(x>0&&y<0)
			System.out.println("("+x+"),("+y+") is in quadrant IV");
	}

}
