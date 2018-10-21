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
		b = (int)(n / 1000 - a * 10);
		c = (int)(n / 100 - a * 100 - b * 10);
		d = (int)(n / 10 - a * 1000 - b * 100 - c * 10);
		e = (int)(n - a * 10000 - b * 1000 - c * 100 - d * 10);
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
		if (a == 0 && b != 0)
		{
			System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.printf("%d%d%d\n",e,d,c);
		}
		if (a == 0 && b == 0 && c == 0 && d != 0)
		{
			System.out.printf("%d%d\n",e,d);
		}
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			System.out.printf("%d\n",e);
		}
		return 0;
	}
}

