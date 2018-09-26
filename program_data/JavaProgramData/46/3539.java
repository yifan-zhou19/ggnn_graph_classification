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
		int[][] sz = new int[m + 2][n + 2];
		for (int i = 0;i < m + 2;i++)
		{
			for (int k = 0;k < n + 2;k++)
			{
				sz[i][k] = 0;
			}
		}
		for (int i = 1;i < m + 1;i++)
		{
			for (int k = 1;k < n + 1;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		int i = 1;
		int j = 1;
		while (i < m + 1 && j < n + 1)
		{
			System.out.printf("%d\n",sz[i][j]);
			sz[i][j] = 0;
			if (sz[i][j + 1] != 0 && sz[i][j - 1] == 0 && sz[i - 1][j] == 0)
			{
				j++;
			}
			else if (sz[i + 1][j] != 0 && sz[i][j + 1] == 0 && sz[i - 1][j] == 0)
			{
				i++;
			}
			else if (sz[i + 1][j] == 0 && sz[i][j - 1] != 0 && sz[i][j + 1] == 0)
			{
				j--;
			}
			else if (sz[i][j - 1] == 0 && sz[i + 1][j] == 0 && sz[i - 1][j] != 0)
			{
				i--;
			}
			else if (sz[i][j - 1] == 0 && sz[i + 1][j] == 0 && sz[i - 1][j] == 0 && sz[i][j + 1] == 0)
			{
				break;
			}
		}
		return 0;
		}

}

