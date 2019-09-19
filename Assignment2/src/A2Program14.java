
public class A2Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=args[0];
		String b=args[1];
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		if(c%d==0 || d%c==0)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
