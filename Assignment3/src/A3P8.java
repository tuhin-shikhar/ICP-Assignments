import java.util.Scanner;
public class A3P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ages of Rahul, Ayush and Ajay");
		double rah=sc.nextDouble();
		double ayu=sc.nextDouble();
		double aja=sc.nextDouble();
		double old1=Math.max(rah,ayu);
		double old2=Math.max(ayu,aja);
		double old=Math.max(old1,old2);
		System.out.println(old+" is the eldest.");
		
	}

}
