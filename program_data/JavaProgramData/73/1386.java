package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int[][] sz = new int[100][100];
		int[] m = new int[100];
		int[] n = new int[100];
		int s;
		max = 0;
		min = 35500;
		s = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][k] = Integer.parseInt(tempVar);
				}
				if (max < sz[i][k])
				{
					max = sz[i][k];
				}
			}
			m[i] = max;
			max = 0;
		}
		for (int p = 0;p < 5;p++)
		{
			for (int q = 0;q < 5;q++)
			{
				if (min > sz[q][p])
				{
					min = sz[q][p];
				}
			}
			n[p] = min;
			min = 100000;
		}
		for (int x = 0;x < 5;x++)
		{
			for (int y = 0;y < 5;y++)
			{
				if (sz[x][y] == m[x] && sz[x][y] == n[y])
				{
					s++;
					System.out.printf("%d %d %d",x + 1,y + 1,sz[x][y]);

				}
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}
	return 0;
	}


}

