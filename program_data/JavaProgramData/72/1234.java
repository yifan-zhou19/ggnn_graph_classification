package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[21][21];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			if (a[0][0] > a[0][1] && a[0][0] > a[1][0])
			{
			System.out.print("0 0\n");
			}
		for (j = 0;j < m + 1;j++)
		{
			a[j][n] = 0;
		}
		for (j = 0;j < n + 1;j++)
		{
			a[m][j] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					continue;
				}
				if (j == 0)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i == 0)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
	}
}

