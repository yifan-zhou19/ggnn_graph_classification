package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
	if (m == 1 || n == 1 || m == 0)
	{
		return 1;
	}
	if (m < n)
	{
		return f(m, m);
	}
	return f(m - n, n) + f(m, n - 1);
	}
	public static int Main()
	{
	int n;
	int m;
	int z;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		z = Integer.parseInt(tempVar);
	}
	while (z-- > 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	System.out.printf("%d\n",f(m, n));
	}
	return 0;
	}
}

