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
		int[] sz = new int[20000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (i > 0)
			{
				for (int j = 0;j < i;j++)
				{
					if (sz[j] == sz[i])
					{
						sz[i] = 0;
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] > 0)
			{
				if (i == 0)
				{
					System.out.printf("%d",sz[i]);
				}
				else
				{
					System.out.printf(" %d",sz[i]);
				}
			}
		}
		return 0;
	}

}

