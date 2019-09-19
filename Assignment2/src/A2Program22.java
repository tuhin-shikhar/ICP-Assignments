
public class A2Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
		double a=r*t;
		double s=Math.exp(a);
		double loan=p*s;
		System.out.println(loan);
	}

}
