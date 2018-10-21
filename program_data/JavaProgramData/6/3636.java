package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int i;
		int j;
		int k;
		int m;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][100];
		for (i = 0;i < p;i++)
		{
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
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][k] = Integer.parseInt(tempVar4);
					}
					if (j == 0 || j == (m - 1))
					{
						sum += sz[j][k];
					}
					else if (j != 0 && j != (m - 1) && k == 0)
					{
							sum += sz[j][k];
					}
					else if (j != 0 && j != (m - 1) && k == (n - 1))
					{
							sum += sz[j][k];
					}
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}

		return 0;
	}
}

