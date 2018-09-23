package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 10000);
		b = (int)((n - a * 10000) / 1000);
		c = (int)((n - a * 10000 - b * 1000) / 100);
		d = (int)((n - a * 10000 - b * 1000 - c * 100) / 10);
		e = (int)(n - a * 10000 - b * 1000 - c * 100 - d * 10);
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

