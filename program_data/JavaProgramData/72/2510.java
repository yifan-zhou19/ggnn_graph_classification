package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[30][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j <= (n + 1);j++)
		{
			h[0][j] = -1;
			h[m + 1][j] = -1;
		}
		for (i = 0;i <= (m + 1);i++)
		{
			h[i][0] = -1;
			h[i][n + 1] = -1;
		}
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((h[i][j] >= h[i - 1][j]) && (h[i][j] >= h[i + 1][j]) && (h[i][j] >= h[i][j - 1]) && (h[i][j] >= h[i][j + 1]))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}



}

