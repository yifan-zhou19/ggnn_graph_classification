package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum;
		int i;
		int n;
		int x;
		int y;
		int u;
		int v;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			for (u = 0;u < x;u++)
			{
				for (v = 0;v < y;v++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[u][v] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (x <= 2 || y <= 2)
			{
				for (u = 0;u < x;u++)
				{
				for (v = 0;v < y;v++)
				{
					sum += a[u][v];
				}
				}
			}
			else
			{
				for (u = 0;u < y;u++)
				{
					sum += a[0][u];
					sum += a[x - 1][u];
				}
				for (u = 1;u < x - 1;u++)
				{
					sum += a[u][0];
					sum += a[u][y - 1];
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

