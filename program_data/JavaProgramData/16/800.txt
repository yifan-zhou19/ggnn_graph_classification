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
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - a * 10000) / 1000;
		c = (n - a * 10000 - b * 1000) / 100;
		e = n % 10;
		d = (n % 100 - e) / 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (c != 0)
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (d != 0)
		{
			System.out.printf("%d%d",e,d);
		}
		else
		{
			System.out.printf("%d",e);
		}
		return 0;
	}

}

