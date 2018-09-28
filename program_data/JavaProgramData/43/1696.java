package <missing>;

public class GlobalMembers
{
	public static int ss(int n)
	{
	int i;
	int j;
	int t = 0;
	for (i = 2;i * i <= n;i++)
	{
	if (n % i == 0)
	{
	break;
	}
	}
	if (i * i > n)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public static int Main()
	{
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a++)
		{
		   if (ss(a) != 0 && ss(m - a) != 0)
		   {
			  System.out.printf("%d %d\n",a,m - a);
		   }
		}
		return 0;
	}
}

