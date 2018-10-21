package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int j;
		int k = 0;
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
		for (i = 0;i < 5;i++)
		{
			max[i] = sz[i][0];
			min[i] = sz[0][i];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (sz[i][j] > max[i])
				{
					max[i] = sz[i][j];
				}
				if (sz[i][j] < min[j])
				{
					min[j] = sz[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,sz[i][j]);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

