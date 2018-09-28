package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int max;
	int e;
	int k;
	int[] sz = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	for (k = 1;k <= n;k++)
	{
		max = 0;
	for (i = 0;i <= n - k;i++)
	{
		if (sz[i] > sz[max])
		{
			max = i;
		}
	}
	if (max != n - k)
	{
		e = sz[max];
		sz[max] = sz[n - k];
		sz[n - k] = e;
	}
	}
	for (i = 0;i < n;i++)
	{
		if (sz[i] % 2 == 1)
		{
			System.out.printf("%d",sz[i]);
			break;
		}
	}
	for (i = i + 1;i < n;i++)
	{
		if (sz[i] % 2 == 1)
		{
			System.out.printf(",%d",sz[i]);
		}
	}
	return 0;
	}


}

