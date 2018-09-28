package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int p;
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
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		p = 0;
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				for (k = 0;k <= m - 1;k++)
				{
					if (a[i][j] > a[k][j])
					{
						break;
					}
				}
				for (l = 0;l <= n - 1;l++)
				{
					if (a[i][j] < a[i][l])
					{
						break;
					}
				}
				if ((k == m) && (l == n))
				{
					System.out.printf("%d+%d",i,j);
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
	}

}

