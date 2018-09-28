package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int m;
		int n;
		int i;
		int M;
		int j;
		int[][] JU = new int[100][100];
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			M = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (h = 0;h < m;h++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						JU[h][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (n == 1)
			{
				for (j = 0;j < m;j++)
				{
					M = M + JU[j][0];
				}
			}
			else if (m == 1)
			{
				for (j = 0;j < n;j++)
				{
					M = M + JU[0][j];
				}
			}
			else
			{
				for (h = 0;h < m;h++)
				{
					if (h > 0 && h < m - 1)
					{
						M = M + JU[h][0] + JU[h][n - 1];
					}
					else
					{
						for (j = 0;j < n;j++)
						{
							M = M + JU[h][j];
						}
					}
				}
			}
			System.out.printf("%d\n",M);
		}
		return 0;
	}

}

