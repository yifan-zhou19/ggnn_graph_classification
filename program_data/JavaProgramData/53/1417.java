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
		int[] sz = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (j == 0)
			{
				System.out.printf("%d",sz[j]);
			}
			else
			{
				int x = j;
				for (int k = 0;k < j;k++)
				{
					if (sz[j] != sz[k])
					{
					 x--;
					}
				}
					if (x == 0)
					{
						System.out.printf(",%d",sz[j]);
					}

			}
		}
		return 0;
	}



}

