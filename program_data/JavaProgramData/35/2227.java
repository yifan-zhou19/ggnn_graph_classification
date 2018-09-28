package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k = 0;
		int[] max = new int[8];
		int[] min = new int[8];
		int[][] sz = new int[8][8];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] > max[i])
				{
					max[i] = sz[i][j];
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			min[j] = sz[0][j];
			for (i = 0;i < n;i++)
			{
				if (sz[i][j] < min[j])
				{
					min[j] = sz[i][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] == max[i] && sz[i][j] == min[j])
				{
					sz[i][j] = 1;
				}
				else
				{
					sz[i][j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (sz[i][j] == 1)
				{
					System.out.printf("%d+%d",i,j);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

