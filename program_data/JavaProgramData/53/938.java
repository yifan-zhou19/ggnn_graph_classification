package <missing>;

public class GlobalMembers
{
	public static int[] mark = new int[300];
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[300];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		}

	for (i = 0;i < n;i++)
	{
		for (int k = i + 1;k < n;k++)
		{
			if (sz[k] == sz[i])
			{
				mark[k] = 1;
			}


		}

	}
	System.out.printf("%d",sz[0]);
	for (i = 1;i < n;i++)
	{
		if (mark[i] == 0)
		{
			System.out.printf(",%d",sz[i]);
		}
	}
	return 0;
	}

}

