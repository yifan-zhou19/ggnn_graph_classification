package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int[][] sz = new int[100][100];
		int row;
		int col;
		int[] add = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			add[i] = 0;
		}

		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (row = 0;row < m;row++)
			{
				for (col = 0;col < n;col++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[row][col] = Integer.parseInt(tempVar4);
					}
				}
			}


			for (col = 0;col < n;col++)
			{
				add[i] += sz[0][col];
				add[i] += sz[m - 1][col];
			}



			for (row = 0;row < m;row++)
			{
				add[i] += sz[row][0];
				add[i] += sz[row][n - 1];
			}

			add[i] -= sz[0][0];
			 add[i] -= sz[m - 1][0];
			add[i] -= sz[0][n - 1];
			add[i] -= sz[m - 1][n - 1];

		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",add[i]);
		}

		return 0;
	}
}

