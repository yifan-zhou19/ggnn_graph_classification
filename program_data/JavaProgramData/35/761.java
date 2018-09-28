package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int q = 0;
		int[][] sz = new int[100][100];
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
			}
		}
		for (i = 0;i < m;i++)
		{
			int max = sz[i][0];
			int k = 0;
			for (j = 1;j < n;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					k = j;
				}
			}
			int min = sz[0][k];
			for (int s = 1;s < m;s++)
			{
				if (sz[s][k] < min)
				{
					min = sz[s][k];
				}
			}
			if (max == min)
			{
				System.out.printf("%d+%d",i,k);
				q = 1;
			}
		}

		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

