package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[N][N];
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a[i][j] < a[i][k])
					{
						break;
					}
				}
				if (k < n)
				{
					continue;
				}
				for (k = 0;k < m;k++)
				{
					if (a[i][j] > a[k][j])
					{
						break;
					}
				}
				if (k < m)
				{
					continue;
				}
				System.out.printf("%d+%d\n",i,j);
				return 0;
			}
		}
		System.out.print("No\n");
		return 0;
	}

}

