package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		if (a == 1 || a == 2)
		{
			return 1;
		}
	else
	{
		return f(a - 1) + f(a - 2);
	}
	}
	public static double xl(int b)
	{
	if (b == 1)
	{
		return 2;
	}
	else
	{
		return (double)f(b + 2) / f(b + 1) + xl(b - 1);
	}
	}
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int m;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	System.out.printf("%.3lf\n",xl(m));
	}
	return 0;
	}



}

