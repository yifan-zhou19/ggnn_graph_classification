package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = -1;
		int b = -1;
		int c = -1;
		int d = -1;
		int e = -1;
		int f = -1;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		while (n >= 0)
		{
			n = n - 100;
			a = a + 1;
		}
		System.out.printf("%d\n",a);
		n = m - 100 * a;
		while (n >= 0)
		{
			n = n - 50;
			b = b + 1;
		}
		System.out.printf("%d\n",b);
		n = m - 50 * b - 100 * a;
		while (n >= 0)
		{
			n = n - 20;
			c = c + 1;
		}
		System.out.printf("%d\n",c);
		n = m - 100 * a - 50 * b - 20 * c;
		while (n >= 0)
		{
			n = n - 10;
			d = d + 1;
		}
		System.out.printf("%d\n",d);
		n = m - 100 * a - 50 * b - 20 * c - 10 * d;
		while (n >= 0)
		{
			n = n - 5;
			e = e+1;
		}
		System.out.printf("%d\n",e);
		n = m - 100 * a - 50 * b - 20 * c - 10 * d - 5 * e;
		while (n >= 0)
		{
			n = n - 1;
			f = f + 1;
		}
		System.out.printf("%d\n",f);
		return 0;
	}
}

