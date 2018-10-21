package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] shan = new int[m + 2][n + 2];
			for (int i = 0;i <= m + 1;i++)
			{
			for (int j = 0;j <= n + 1;j++)
			{
				shan[i][j] = 0;
			}
			}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shan[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if ((shan[i][j] >= shan[i - 1][j]) && (shan[i][j] >= shan[i][j - 1]) && (shan[i][j] >= shan[i + 1][j]) && (shan[i][j] >= shan[i][j + 1]))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;

	}
}

