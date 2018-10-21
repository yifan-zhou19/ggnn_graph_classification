package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int a;
		int[][] num = new int[150][150];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
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
			sum = 0;
			for (j = 0;j < m;j++)
			{
				for (a = 0;a < n;a++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						num[j][a] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				sum += num[0][j];
								if (m != 1)
								{
				sum += num[m - 1][j];
								}
			}
			for (j = 1;j < m - 1;j++)
			{
				sum += (num[j][0]);
	if (n != 1)
	{
				sum += num[j][n - 1];
	}

			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}



}

