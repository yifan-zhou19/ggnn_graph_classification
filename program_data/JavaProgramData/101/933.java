package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final char[][] r =
		{
			{'A', 'B', 'C'},
			{'A', 'C', 'B'},
			{'B', 'A', 'C'},
			{'C', 'A', 'B'},
			{'B', 'C', 'A'},
			{'C', 'B', 'A'}
		};
		final int[][] n =
		{
			{1, 1, 1},
			{1, 1, -1},
			{-1, 1, 1},
			{1, -1, -1},
			{-1, -1, 1},
			{-1, -1, -1}
		};
		int[][] nn =
		{
			{-1, 2, 0},
			{1, 1, 2},
			{-1, 2, -1}
		};
		int is;
		int i;
		for (i = 0;i < 6;i++)
		{
			is = 1;
			int[] l = {0, 0, 0};
			int[] L = {0, 0, 0};
			for (int j = 0;j < 3;j++)
			{
				for (int p = 0;p < 3;p++)
				{
					if (nn[p][j] == n[i][j] || nn[p][j] == 0)
					{
						l[p]++;
					}
				}
			}
			if (l[0] >= l[1])
			{
				L[0] = 1;
			}
			else
			{
				L[0] = -1;
			}
			if (l[1] >= l[2])
			{
				L[2] = 1;
			}
			else
			{
				L[2] = -1;
			}
			if (l[0] >= l[2])
			{
				L[1] = 1;
			}
			else
			{
				L[1] = -1;
			}
			for (int w = 0;w < 3;w++)
			{
				if (L[w] != n[5 - i][w])
				{
					is = 0;
				}
			}
			if (is == 1)
			{
				for (int x = 0;x < 3;x++)
				{
					System.out.print(r[i][x]);
				}
					  break;
			}
		}
	}
}
