import java.util.Scanner;
public class A3P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		if(marks>=40)
			System.out.println("Congratulations! You have passed the exam.");
		else
			System.out.println("Sorry! You have failed the exam.");
	}

}
