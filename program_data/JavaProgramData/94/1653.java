package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int i;
		int n;
		int k;
		int e;
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
		for (k = 1;k < n;k++)
		{
		for (i = 0;i < n - k;i++)
		{
			if (sz[i] > sz[i + 1])
			{
			e = sz[i];

			sz[i] = sz[i + 1];
			sz[i + 1] = e;
			}
		}
		}


			for (i = 0;i < n;i++)
			{
				if (sz[i] % 2 != 0)
				{
					System.out.printf("%d",sz[i]);
					break;
				}
			}
			for (i++;i < n;i++)
			{
				if (sz[i] % 2 != 0)
				{
					System.out.printf(",%d",sz[i]);
				}
			}
	return 0;
	}
}

