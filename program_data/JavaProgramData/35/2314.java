package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int u;
		int n;
		int m;
		int[][] data = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (l = 0,i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				u = 1;
				for (k = 1;k <= m;k++)
				{
					if (data[i][j] < data[i][k])
					{
						u = 0;
					}
				}
				for (k = 1;k <= n;k++)
				{
					if (data[k][j] < data[i][j])
					{
						u = 0;
					}
				}
				if (u == 1)
				{
					System.out.printf("%d+%d",i - 1,j - 1);
					l = 1;
				}
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
	}
}

