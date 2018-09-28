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
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[9][9];
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				sz[i][j] = 0;
			}
		}
		sz[4][4] = m;
		int[] a = new int[100];
		int[] row = new int[100];
		int[] col = new int[100];
		int v = 0;
		for (int k = 0;k < n;k++)
		{
			for (int l = 0;l < 9;l++)
			{
				for (int u = 0;u < 9;u++)
				{
					if (sz[l][u] != 0)
					{
						a[v] = sz[l][u];
						row[v] = l;
						col[v] = u;
						v++;
					}
				}
			}
				for (int w = 0;w < 9;w++)
				{
					for (int m = 0;m < 9;m++)
					{
						sz[w][m] = 0;
					}
				}
			for (int c = 0;c < v;c++)
			{
				sz[row[c] + 1][col[c] + 1] += a[c];
				sz[row[c] + 1][col[c]] += a[c];
				sz[row[c]][col[c] + 1] += a[c];
				sz[row[c] - 1][col[c] - 1] += a[c];
				sz[row[c] - 1][col[c]] += a[c];
				sz[row[c]][col[c] - 1] += a[c];
				sz[row[c] + 1][col[c] - 1] += a[c];
				sz[row[c] - 1][col[c] + 1] += a[c];
				sz[row[c]][col[c]] += 2 * a[c];
			}
				int[] a = new int[100];
				int[] row = new int[100];
				int[] col = new int[100];
				v = 0;
		}
		for (int p = 0;p < 9;p++)
		{
			for (int q = 0;q < 8;q++)
			{
				System.out.printf("%d ",sz[p][q]);
			}
			System.out.printf("%d\n",sz[p][8]);
		}
		return 0;
	}
}

