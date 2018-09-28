package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] h = new int[21][21];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (j == 1)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						h[i][j] = Integer.parseInt(tempVar3);
					}
				}
				else if (j != 1)
				{
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						h[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j + 1])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}

	}
}

