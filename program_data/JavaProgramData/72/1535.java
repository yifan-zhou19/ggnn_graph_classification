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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] height = new int[m + 2][n + 2];
		int i1;
		int i2;
		for (i2 = 0; i2 < n + 2; i2++)
		{
			height[0][i2] = -1;
			height[m + 1][i2] = -1;
		}
		for (i1 = 0; i1 < m + 2; i1++)
		{
			height[i1][0] = -1;
			height[i1][n + 1] = -1;
		}
		for (i1 = 1; i1 < m + 1; i1++)
		{
			for (i2 = 1; i2 < n + 1; i2++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					height[i1][i2] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i1 = 1; i1 < m + 1; i1++)
		{
			for (i2 = 1; i2 < n + 1; i2++)
			{
				if (height[i1][i2] >= height[i1 - 1][i2] != 0 && height[i1][i2] >= height[i1 + 1][i2] != 0 && height[i1][i2] >= height[i1][i2 - 1] != 0 && height[i1][i2] >= height[i1][i2 + 1])
				{
					System.out.printf("%d %d\n", i1 - 1, i2 - 1);
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}

}

