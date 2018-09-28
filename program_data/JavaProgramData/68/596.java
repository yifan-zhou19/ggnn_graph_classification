package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
	int c = 1;
	int i;
	if (a % 2 == 0)
	{
		c = 0;
	}
	else
	{
		for (i = 3;i <= Math.sqrt(a);i = i + 2)
		{
			if (a % i == 0)
			{
				c = 0;
				break;
			}
		}
	}
	return (c);
	}
	public static int Main()
	{
	int n;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 6;k <= n;k = k + 2)
	{
	for (j = 2;j <= k / 2;j++)
	{
		if ((f(j) == 1) & (f(k - j) == 1))
		{
			System.out.printf("%d=%d+%d\n",k,j,k - j);
			break;
		}
	}
	}
	}
}

