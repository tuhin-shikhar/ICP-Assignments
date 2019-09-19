import java.util.Scanner;
public class A3P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char c=sc.next().charAt(0);
		if(c>=65&&c<=90)
			System.out.println("The character is a capital letter.");
		else if(c>=97&&c<=122)
			System.out.println("The character is a small letter.");
		else if(c>=48&&c<=57)
			System.out.println("The character is a digit.");
		else if((c>=0&&c<=47)||(c>=58&&c<=64)||(c>=91&&c<=96)||(c>=123&&c<=127))
			System.out.println("The character is a special character.");
			
	}

}
