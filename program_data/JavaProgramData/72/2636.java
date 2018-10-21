package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] c = new int[20][20];
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
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0)
				{
					if (j == 0)
					{
						if (c[i][j] >= c[i + 1][j] != 0 && c[i][j] >= c[i][j + 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j == n - 1)
					{
						if (c[i][j] >= c[i + 1][j] != 0 && c[i][j] >= c[i][j - 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j > 0 && j < n - 1)
					{
						if (c[i][j] >= c[i][j - 1] != 0 && c[i][j] >= c[i][j + 1] != 0 && c[i][j] >= c[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}

				}
				else if (i == m - 1)
				{

					if (j > 0 && j < n - 1)
					{
						if (c[i][j] >= c[i][j - 1] != 0 && c[i][j] >= c[i][j + 1] != 0 && c[i][j] >= c[i - 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					if (j == 0)
					{
						if (c[i][j] >= c[i - 1][j] != 0 && c[i][j] >= c[i][j + 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					if (j == n - 1)
					{
						if (c[i][j] >= c[i - 1][j] != 0 && c[i][j] >= c[i][j - 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
				else if (i > 0 && i < m - 1)
				{
					if (j == 0)
					{
						if (c[i][j] >= c[i][j + 1] != 0 && c[i][j] >= c[i - 1][j] != 0 && c[i][j] >= c[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j > 0 && j < n - 1)
					{
						if (c[i][j] >= c[i][j - 1] != 0 && c[i][j] >= c[i][j + 1] != 0 && c[i][j] >= c[i - 1][j] != 0 && c[i][j] >= c[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j == n - 1)
					{
						if (c[i][j] >= c[i - 1][j] != 0 && c[i][j] >= c[i + 1][j] != 0 && c[i][j] >= c[i][j - 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
			}
		}
	}




}

