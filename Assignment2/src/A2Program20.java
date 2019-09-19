
public class A2Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=Integer.parseInt(args[1]);
		int m=Integer.parseInt(args[0]);
		boolean a1=true;
		boolean a2=false;
		if(m==3)	//March
		{
			if(d>=20 && d<=31)
			{
				System.out.println(a1);
			}
			else
			{
				System.out.println(a2);
			}
		}
		else if(m==4)	//April
		{
			if(d>=1 && d<=30)
			{
				System.out.println(a1);
			}
			else
			{
				System.out.println(a2);
			}
		}
		else if(m==5)	//May
		{
			if(d>=1 && d<=30)
			{
				System.out.println(a1);
			}
			else
			{
				System.out.println(a2);
			}
		}
		else if(m==6)	//June
		{
			if(d>=1 && d<=31)
			{
				System.out.println(a1);
			}
			else
			{
				System.out.println(a2);
			}
		}
		else
		{
			System.out.println(a2);
		}
		
	}

}
