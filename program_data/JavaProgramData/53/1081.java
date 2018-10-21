package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a = 0;
		int[] sz = new int[300];
		int[] sa = new int[300];
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
	for (i = 0;i < n;i++)
	{
		for (j = i - 1;j >= 0;j--)
		{
			if (sz[i] == sz[j])
			{
				sz[i] = 0;
			}
		}
	}
	System.out.printf("%d",sz[0]);
	for (i = 1;i < n;i++)
	{
		if (sz[i] != 0)
		{
			System.out.printf(",%d",sz[i]);
		}
	}

		return 0;
	}

}

