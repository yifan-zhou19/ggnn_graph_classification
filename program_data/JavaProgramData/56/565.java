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
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		if ((a == 0) && (b != 0))
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		if ((a == 0) && (b == 0) && (c != 0))
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		if ((a == 0) && (b == 0) && (c == 0) && (d != 0))
		{
			System.out.printf("%d%d",e,d);
		}
		if ((a == 0) && (b == 0) && (c == 0) && (d == 0) && (e != 0))
		{
			System.out.printf("%d",e);
		}
		return 0;
	}


}

