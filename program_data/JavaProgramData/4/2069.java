package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.printf("%d",sz[0][0]);
		int k;
		int n;
		if (h > l)
		{
			for (k = 1;k <= h + l - 2;k++)
			{
				if (k <= l - 1)
				{
					for (i = 0;i <= k;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
				else if (k > l - 1 && k <= h - 1)
				{
					for (i = k - l + 1;i <= k;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
				else
				{
					for (i = k - l + 1;i <= h - 1;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
			}
		}
		else if (h < l)
		{
			for (k = 1;k <= h + l - 2;k++)
			{
				if (k <= h - 1)
				{
					for (i = 0;i <= k;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
				else if (k > h - 1 && k <= l - 1)
				{
					for (i = 0;i <= h - 1;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
				else
				{
					for (i = k - l + 1;i <= h - 1;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
			}
		}
		else
		{
			for (k = 1;k <= h + l - 2;k++)
			{
				if (k <= h - 1)
				{
					for (i = 0;i <= k;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
				else
				{
					for (i = k - h + 1;i <= h - 1;i++)
					{
						System.out.printf("\n%d",sz[i][k - i]);
					}
				}
			}
		}
		return 0;
	}

}

