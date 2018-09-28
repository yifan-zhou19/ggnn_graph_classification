package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] map = new int[6][6];
		int i;
		int j;
		int k;
		int g = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					map[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0; i < 5; i++)
		{
			k = 0;
			for (j = 1; j < 5; j++)
			{
				if (map[i][j] > map[i][k])
				{
					k = j;
				}
			}
			for (j = 0; j < 5; j++)
			{
				if (j != i && map[j][k] < map[i][k])
				{
					break;
				}
			}
			if (j >= 5)
			{
				System.out.printf("%d %d %d\n", i + 1, k + 1, map[i][k]);
				g = 1;
			}
		}
		if (g == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

