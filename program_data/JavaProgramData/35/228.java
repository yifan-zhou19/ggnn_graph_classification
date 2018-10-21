package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] z = new int[8][8];
		int i;
		int j;
		int k;
		int u;
		int o = 0;
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
					z[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (z[i][j] < z[i][k])
					{
						break;
					}
				}
				if (k == n)
				{
					for (u = 0;u < m;u++)
					{
						if (z[i][j] > z[u][j])
						{
							break;
						}
					}
					if (u == m)
					{
						System.out.printf("%d+%d",i,j);
					}
					else
					{
						o++;
					}
				}
			}
		}
		if (o == m)
		{
			System.out.print("No");
		}
	}
}

