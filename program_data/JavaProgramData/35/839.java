package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int l = 0;
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < m;k++)
				{
					if (a[i][j] >= a[i][k])
					{
						b[i][j]++;
					}
				}
				for (k = 0;k < n;k++)
				{
					if (a[i][j] <= a[k][j])
					{
						b[i][j]++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (b[i][j] >= n + m)
				{
					l++;
					System.out.printf("%d+%d",i,j);
				}
				else
				{
					continue;
				}
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
	}

}

