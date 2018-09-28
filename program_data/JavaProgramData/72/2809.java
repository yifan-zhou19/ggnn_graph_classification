package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					if (i == 0)
					{
						if (j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
						else if (j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
						else if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
					}
					else if (i == m - 1)
					{
						if (j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							P;
						}
						else if (j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							P;
						}
						else if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							P;
						}
					}
					else
					{
						if (j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
						else if (j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
						else if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
						{
							P;
						}
					}
				}
			}
	}



}

