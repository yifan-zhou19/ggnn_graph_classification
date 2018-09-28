package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] num = new int[10][10];
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
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int f;
		int p;
		int q;
		int g = -1;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				f = -1;
				for (p = 1;p <= n;p++)
				{
					if (num[i][p] > num[i][j])
					{
						f = 1;
					}
				}
				for (q = 1;q <= m;q++)
				{
					if (num[q][j] < num[i][j])
					{
						f = 1;
					}
				}
				if (f == -1)
				{
					System.out.printf("%d+%d",i - 1,j - 1);
					g = 1;
				}
			}
		}
		if (g == -1)
		{
			System.out.print("No");
		}
		return 0;
	}


}

