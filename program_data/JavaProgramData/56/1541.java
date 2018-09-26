package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = (n - 10000 * a - 1000 * b - 100 * c - 10 * d) / 1;
		if (a == 0 && b != 0)
		{
		System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		else if (b == 0 && c != 0)
		{
		System.out.printf("%d%d%d\n",e,d,c);
		}
		else if (c == 0 && d != 0)
		{
		System.out.printf("%d%d\n",e,d);
		}
		else if (d == 0)
		{
		System.out.printf("%d\n",e);
		}
		else
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
	}
}

