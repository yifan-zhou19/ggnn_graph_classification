package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int gs = 0;
		int i;
		int j;
		int m;
		int n;
		int[][] sz = new int[8][8];
		int[] ls = new int[8];
		int[] max = new int[8];
		int[] min = new int[8];
		int[] hs = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i][j] = Integer.parseInt(tempVar3);
		}
		max[i] = sz[i][0];
		if (sz[i][j] > max[i])
		{
			max[i] = sz[i][j];
			ls[i] = j;
		}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
			min[j] = sz[0][j];
			if (sz[i][j] < min[j])
			{
			min[j] = sz[i][j];
			hs[j] = i;
			}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d", j,i);
					gs = 1;
				}
			}
		}
		if (gs == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

