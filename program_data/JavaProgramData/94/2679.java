package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}

		int e;
		for (int t = 1;t <= n;t++)
		{
			for (i = 0;i < n - t;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
	int k = 0;
	int[] ul = new int[k];
		   for (i = 0;i < n;i++)
		   {
	for (int a = 1;a <= sz[n - 1];a = a + 2)
	{
	if (a == sz[i])
	{
		k = k + 1;
	}
	}
		   }
	int f;
	f = k;
	k = 0;
	for (i = 0;i < n;i++)
	{
	for (int a = 1;a <= sz[n - 1];a = a + 2)
	{
	if (a == sz[i])
	{
	ul[k] = sz[i];
	k++;
	}
	}
	}
	for (k = 0;k < f - 1;k++)
	{
		System.out.printf("%d,",ul[k]);
	}
	System.out.printf("%d",ul[f - 1]);
		return 0;
	}
}

