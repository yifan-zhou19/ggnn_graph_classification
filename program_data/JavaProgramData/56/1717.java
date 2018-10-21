package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = x / 1000 - 10 * a;
		c = x / 100 - 100 * a - 10 * b;
		d = x / 10 - 1000 * a - 100 * b - 10 * c;
		e = x % 10;
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
			System.out.printf("%d%d%d%",e,d,c);
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

