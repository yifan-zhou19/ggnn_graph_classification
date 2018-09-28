package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int e;
	int d;
	int k = 1;
	int[] sz = new int[100];
	int[] sum = new int[100];
	sz[0] = 2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int c = 0;
	for (i = 0;i < n - 1;i++)
	{
		for (d = 0;d < 100;d++)
		{
		sum[d] = sz[d] + sz[d] + c;
			if (sum[d] >= 10)
			{
			sum[d] -= 10;
			c = 1;
			}
			else
			{
			c = 0;
			}
		}
		for (e = 0;e < 100;e++)
		{
		sz[e] = sum[e];
		}
	}
	int f = 99;
	while (sz[f] == 0)
	{
	f--;
	}
	if (n != 0)
	{
		for (i = f;i >= 0;i--)
		{
		System.out.printf("%d",sz[i]);
		}
	}
	else
	{
	System.out.print("1");
	}
	System.out.print("\n");
	return 0;
	}

}

