package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int m;
	int n;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	n = m / 2;
	for (i = 1;i <= n;i++)
	{
	p = m - i;
	for (j = 2;j <= i;j++)
	{
	if (i % j == 0)
	{
		break;
	}
	}
	for (k = 2;k <= p;k++)
	{
	if (p % k == 0)
	{
		break;
	}
	}
	if (j == i && k == p)
	{
	System.out.printf("%d %d\n",i,p);
	}
	}
	}

}

