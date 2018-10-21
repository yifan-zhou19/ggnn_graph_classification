package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int f;
		int e;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 100;
		c = (a % 100) / 50;
		d = (a % 50) / 20;
		e = (a % 50 % 20) / 10;
		f = (a % 10) / 5;
		g = a % 5;
	   System.out.printf("%d\n",b);
	 System.out.printf("%d\n",c);
	 System.out.printf("%d\n",d);
	 System.out.printf("%d\n",e);
	 System.out.printf("%d\n",f);
	 System.out.printf("%d\n",g);

	 return 0;
	}


}

