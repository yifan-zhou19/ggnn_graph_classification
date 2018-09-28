package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int m;
		int n;
		int[][] a = new int[8][8];
		int b;
		int o;
		int x;
		int y;
		int w;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	for (o = 0;o < m;o++)
	{
		for (k = 0;k < n;k++)
		{
			x = 0;
			y = 0;
			for (t = 0;t < n;t++)
			{
				if (a[o][k] >= a[o][t])
				{
					x = x + 1;
				}
			}
			if (x == n)
			{
				for (b = 0;b < m;b++)
				{
					if (a[o][k] <= a[b][k])
					{
						y = y + 1;
					}
				}

				if (y == m)
				{
					w = 1;
					System.out.printf("%d+%d",o,k);
				}
			}
		}
	}
	if (w != 1)
	{
		System.out.print("No");
	}

	}
}

