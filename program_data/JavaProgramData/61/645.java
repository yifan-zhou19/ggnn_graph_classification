package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int i;
	int j;
	int k;
	int[] sz = new int[1000];
	int[] x = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	sz[0] = 1;
	sz[1] = 1;
	for (j = 0;j <= n - 1;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a >= 3)
		{
	for (i = 0;i <= a - 3;i++)
	{
	sz[i + 2] = sz[i] + sz[i + 1];
	x[j] = sz[i + 2];
	}
		}
		else
		{
				x[j] = 1;
		}
	}
	for (k = 0;k < n;k++)
	{
		System.out.printf("%d\n",x[k]);
	}

		return 0;
	}


}

