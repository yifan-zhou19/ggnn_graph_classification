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
		b = ((n - a) / 10) % 10;
		c = ((n - a - b * 10) / 100) % 10;
		d = ((n - a - 10 * b - 100 * c) / 1000) % 10;
		e = ((n - a - 10 * b - 100 * c - 1000 * d) / 10000) % 10;
		   if (b == 0)
		   {
			System.out.printf("%d",a);
		   }
		   if (c == 0 && b != 0)
		   {
			System.out.printf("%d%d",a,b);
		   }
			if (d == 0 && c != 0)
			{
			System.out.printf("%d%d%d",a,b,c);
			}
			if (e == 0 && d != 0)
			{
			 System.out.printf("%d%d%d%d",a,b,c,d);
			}
			if (e != 0)
			{
				System.out.printf("%d%d%d%d%d",a,b,c,d,e);
			}
		return 0;
	}
}

