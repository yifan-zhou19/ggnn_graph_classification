package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int sum = 0;
		int[][] cell = new int[22][22];

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
		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < n + 1; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					cell[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < n + 1; j++)
			{
				if (cell[i][j] - cell[i][j - 1] >= 0 && cell[i][j] - cell[i][j + 1] >= 0 && cell[i][j] - cell[i + 1][j] >= 0 && cell[i][j] - cell[i - 1][j] >= 0)
				{
					System.out.printf("%d %d\n", i - 1, j - 1);
				}
			}
		}

		return 0;
	}
}

