package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[500];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[m]) = Integer.parseInt(tempVar2);
			}
		}
		int e;
		for (int k = 1;k <= n;k++)
		{
			for (int i = 0;i < n - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		int a = 0;
		int[] j = new int[500];
		int b = 0;
		for (b = 0;b < n;b++)
		{
			if (sz[b] % 2 != 0)
			{
				j[a] = sz[b];
				a++;
			}
			else
			{
				sz[b] = sz[b];
			}
		}
		int c = 0;
		for (c = 0;c < a - 1;c++)
		{
			System.out.printf("%d,",j[c]);
		}
		System.out.printf("%d",j[c]);
		return 0;
	}



}

