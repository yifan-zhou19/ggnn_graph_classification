package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int i;
		int j;
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
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0; i < m; i++)
		{
			max[i] = a[i][0];
			for (j = 1; j < n; j++)
			{
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			}
		}

		for (j = 0; j < n; j++)
		{
			min[j] = a[0][j];
			for (i = 1; i < m; i++)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
		}

		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d", i, j);
					return 0;
				}
			}
		}
		System.out.print("No");

		return 0;
	}


}

