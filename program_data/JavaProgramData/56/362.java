package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
		a = (int)n / 10000;
		b = (int)(n - a * 10000) / 1000;
		c = (int)(n - a * 10000 - b * 1000) / 100;
		d = (int)(n - a * 10000 - b * 1000 - c * 100) / 10;
		e = (int)(n - a * 10000 - b * 1000 - c * 100 - d * 10) / 1;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
		if (a == 0 && b != 0 && c != 0 && d != 0)
		{
			System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		if (a == 0 && b == 0 && c != 0 && d != 0)
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
	}
}

