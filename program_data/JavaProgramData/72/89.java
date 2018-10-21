package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] x = new int[21][21];
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
		for (i = 0;i < 21;i++)
		{
			for (j = 0;j < 21;j++)
			{
				x[i][j] = 0;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((x[i][j] >= x[i - 1][j]) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i][j + 1]) && (x[i][j] >= x[i + 1][j]))
					{
						System.out.printf("%d %d\n",i - 1,j - 1);
					}
				}
			}
	}
}

