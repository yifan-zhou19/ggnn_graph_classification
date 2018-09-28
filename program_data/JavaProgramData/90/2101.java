package <missing>;

public class GlobalMembers
{
	public static int method(int(m),int(n))
	{
		int c;
		if (m == 0)
		{
			c = 1;
		}
		if (m == 1)
		{
			c = 1;
		}
		if (n == 1)
		{
			c = 1;
		}
		if (m >= n && m > 1 && n > 1)
		{
		   c = method(m, n - 1) + method(m - n, n);
		}
		if (m < n && m>1 && n > 1)
		{
		   c = method(m, n - 1);
		}
		return c;
	}
	public static int print()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",method(m, n));
	}
	public static int Main()
	{
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		   print();
		}

	}
}

