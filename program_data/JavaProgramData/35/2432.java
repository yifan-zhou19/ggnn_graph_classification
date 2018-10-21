package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int e;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[8][8];
		int[][] td = new int[8][8];
		int[] zd = new int[8];
		int[][] bj = new int[8][8];
		int[] hd = new int[8];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			td[i][j] = sz[i][j];
			bj[i][j] = sz[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] > sz[i][j + 1])
				{
					sz[i][j + 1] = sz[i][j];
				}
			}
		}
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < m;j++)
			{
				if (td[i][j] == sz[i][m - 1])
				{
					zd[i] = j;
				}
			}
			}
			for (j = 0;j < m;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (bj[i][j] < bj[i + 1][j])
					{
						bj[i + 1][j] = bj[i][j];
					}
				}
			}
			for (j = 0;j < m;j++)
			{
			for (i = 0;i < n;i++)
			{
				if (td[i][j] == bj[n - 1][j])
				{
					hd[j] = i;
				}
			}
			}
			for (i = 0;i < n;i++)
			{
				a = zd[i];
				if (hd[a] == i)
				{
					System.out.printf("%d+%d",i,a);
					return 0;
				}
			else
			{
				continue;
			}


			}
			System.out.print("No");
			return 0;
	}

}

