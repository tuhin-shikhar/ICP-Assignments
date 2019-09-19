import java.util.Random;
public class A2Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Random r = new Random();
		int e=r.nextInt(y);
		int f=r.nextInt(y);
		System.out.println(e+f);
		
	}

}
