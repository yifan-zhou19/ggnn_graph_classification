package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		b = ((n - a) % 100) / 10;
		c = ((n - 10 * b - a) % 1000) / 100;
		if (c == 0)
		{
			System.out.printf("%d%d",a,b);
		}
		else
		{
			 d = ((n - 100 * c - 10 * b - a) % 10000) / 1000;
			 if (d == 0)
			 {
				  System.out.printf("%d%d%d",a,b,c);
			 }
			 else
			 {
				  e = n / 10000;
				  if (e == 0)
				  {
					   System.out.printf("%d%d%d%d",a,b,c,d);
				  }
				  else
				  {
					   System.out.printf("%d%d%d%d%d",a,b,c,d,e);
				  }
			 }
		}
		return 0;
	}

}

