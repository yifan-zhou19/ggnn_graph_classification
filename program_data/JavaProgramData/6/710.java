package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int sum = 0;
		int[][] shuzu = new int[NUM][NUM];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			int m;
			int n;
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
			for (int s = 0;s < m;s++)
			{
				for (int t = 0;t < n;t++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(shuzu[s][t]) = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m > 2 && n > 2)
			{
				for (int x = 0;x < m;x++)
				{
					sum += shuzu[x][0] + shuzu[x][n - 1];
				}
				for (int y = 1;y < n - 1;y++)
				{
					sum += shuzu[0][y] + shuzu[m - 1][y];
				}
			}
			else
			{
				for (int z = 0;z < m;z++)
				{
					for (int h = 0;h < n;h++)
					{
						sum += shuzu[z][h];
					}
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}
}

