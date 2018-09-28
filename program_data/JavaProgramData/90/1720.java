package <missing>;

public class GlobalMembers
{
	public static int col(int m, int n)
	{
		int t;
	if (n == 0)
	{
	t = 0;
	}
	else if (m == 0)
	{
	t = 1;
	}
	else if (n > m)
	{
	t = col(m, m);
	}
	else if (n <= m)
	{
	t = col(m, n - 1) + col(m - n, n);
	}
	return (t);
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
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
	t = col(a, b);
	System.out.printf("%d\n",t);
	}
	return 0;
	}
}

