package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (sz[j] > sz[j + 1])
				{
					a = sz[j + 1];
					sz[j + 1] = sz[j];
					sz[j] = a;
				}
			}
		}
		j = 0;
		while (sz[j] % 2 == 0)
		{
			j += 1;
		}
		System.out.printf("%d",sz[j]);
		for (j = j + 1;j < n;j++)
		{
			if (sz[j] % 2 != 0)
			{
				System.out.printf(",%d",sz[j]);
			}
		}
		return 0;
	}
}

