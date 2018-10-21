package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int max;
		int min;
		int m;
		for (i = 0;i < 5;i++)
		{
			max = sz[i][0];
			m = 0;
			for (j = 1;j < 5;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					m = j;
				}
			}
			min = sz[i][m];
			for (j = 0;j < 5;j++)
			{
				if (sz[j][m] < min)
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.printf("%d %d %d\n",i + 1,m + 1,min);
				return 0;
			}

		}
		System.out.print("not found");
		return 0;
	}


}

