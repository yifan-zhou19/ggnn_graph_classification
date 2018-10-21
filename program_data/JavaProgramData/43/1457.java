package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m = 3;
	int i;
	int n;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (m <= n / 2)
	{
		for (i = 2;i <= m - 1;i++)
		{
	if (m % i == 0)
	{
		break;
	}
		}
	if (i >= m)
	{
		a = n - m;
	for (i = 2;i <= a - 1;i++)
	{
	if (a % i == 0)
	{
		break;
	}
	}
	if (i == a)
	{
	System.out.printf("%d %d\n",m,a);
	}
	}
	m = m + 2;
	}
	}


}

