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
		float a;
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
		for (i = 0;i < n + 2;i++)
		{
			h[0][i] = h[m + 1][i] = 0;
		}
		for (i = 0;i < m + 2;i++)
		{
			h[i][0] = h[i][n + 1] = 0;
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
				if (h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j])
				{
				System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}

}

