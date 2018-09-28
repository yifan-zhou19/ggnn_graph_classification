package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] h = new int[22][22];
		int[][] a = new int[22][22];
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			h[i][0] = 0;
			h[i][n + 1] = 0;
		}
		for (j = 0;j <= n + 1;j++)
		{
			h[0][j] = 0;
			h[m + 1][j] = 0;
		}


		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}

		}
		return 0;


	}
}

