package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 1000);
		e = n - 1000 * a;
		b = (int)(e / 100);
		f = e-100 * b;
		c = (int)(f / 10);
		g = f - 10 * c;
		if (n >= 10000)
		{
			System.out.print("00001");
		}
	else
	{
		if (n >= 1000)
		{
			System.out.printf("%d%d%d%d",g,c,b,a);
		}
	else
	{
		if (n >= 100)
		{
			   System.out.printf("%d%d%d",g,c,b);
		}
			   else
			   {
				   if (n >= 10)
				   {
				   System.out.printf("%d%d",g,c);
				   }
			   else
			   {
				   System.out.printf("%d",g);
			   }
			   }
	}
	}
		return 0;
	}

}

