package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int i;
		int k;
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
			for (k = 0;k < n;k++)
			{
				if (sz[i] == sz[k] && i != k && sz[k] != 100000000)
				{
					sz[k] = 100000000;
				}
			}
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
					if (sz[i] == 100000000)
					{
						continue;
					}

					System.out.printf(",%d",sz[i]);
		}

				return 0;
	}

}

