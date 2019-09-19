
public class A2Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=args[0];
		String b=args[1];
		String c=args[2];
		int d=Integer.parseInt(a);
		int e=Integer.parseInt(b); 
		int f=Integer.parseInt(c);
		int x=d+e;
		int y=e+f;
		int z=d+f;
		if(d>=y||e>=z||f>=x)
		{
		 System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
