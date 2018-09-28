package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		(int)sz[500],(odd[500]);
		int j;
		int i;
		int n;
		int k;
		int a;
		int e;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	a = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = tempVar2;
			}
			if ((sz[i]) % 2 != 0)
			{
				a += 1;
			}
		}
		for (k = 1;k <= n;k++)
		{
		for (i = 1;i < n;i++)
		{
			if ((sz[i]) % 2 != 0)
			{
				g = sz[i - 1];
				sz[i - 1] = sz[i];
				sz[i] = g;
			}
		}
		}

		for (k = 1;k <= a;k++)
		{
			for (i = 0;i < a - 1;i++)
			{
				if (sz[i + 1] < sz[i])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}

	for (i = 0;i < a;i++)
	{
		if (i < a - 1)
		{
			System.out.printf("%d,",sz[i]);
		}
		else
		{
			System.out.printf("%d",sz[i]);
		}
	}

	return 0;

	}
}

