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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		b = ((n % 100) - a) / 10;
		c = ((n % 1000) - (10 * b + a)) / 100;
		d = (n - 100 * c - 10 * b - a) / 1000;
		if (d != 0)
		{
			System.out.printf("%d%d%d%d",a,b,c,d);
		}
		else if (c)
		{
			System.out.printf("%d%d%d",a,b,c);
		}
		else if (b)
		{
			System.out.printf("%d%d",a,b);
		}
		else
		{
			System.out.printf("%d",a);
		}
		return 0;
	}

}

