
public class A2Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		double maxi1=Math.max(a,b);
		double maxi2=Math.max(b,c);
		double maxi,low;
		if(maxi1>maxi2)
			maxi=maxi1;
		else
			maxi=maxi2;
		double low1=Math.min(a,b);
		double low2=Math.min(b,c);
		if(low1<low2)
			low=low1;
		else
			low=low2;
		double mid=(a+b+c)-(maxi+low);
		System.out.println((int)low+"<"+(int)mid+"<"+(int)maxi);
	}

}
