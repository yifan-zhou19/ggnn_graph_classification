package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[300];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",sz[0]);
		for (int j = 1;j < n;j++)
		{
			int k;
			for (k = 0;k < j;k++)
			{
				if (sz[j] == sz[k])
				{
					break;
				}
			}
			if (k == j)
			{
				System.out.printf(",%d",sz[j]);
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

