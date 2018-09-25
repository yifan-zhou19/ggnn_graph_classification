package <missing>;

public class GlobalMembers
{
	public static int fun2(int m, int n)
	{
		if (m < n)
		{
			n = m;
		}
		if (m == 1)
		{
			return 1;
		}
		else if (m == 0)
		{
			return 1;
		}
		else
		{
			return (fun1(m, n - 1) + fun2(m - n, n));
		}
	}
	public static int fun1(int m, int n)
	{
		if (m < n)
		{
			n = m;
		}
		if (n == 1)
		{
			return 1;
		}
		else if (n == 0)
		{
			return 0;
		}
		else
		{
			return (fun1(m, n - 1) + fun2(m - n, n));
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int a;
			int b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a < b)
			{
				b = a;
			}
			System.out.printf("%d\n",fun1(a, b - 1) + fun2(a - b, b));
		}
	}

}

