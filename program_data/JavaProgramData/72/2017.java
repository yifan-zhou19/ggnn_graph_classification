package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		int i = 0;
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
		int[][] dk = new int[20][20];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(dk[i][j]) = Integer.parseInt(tempVar3);
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
						if (dk[i][j] >= dk[i][j + 1] != 0 && dk[i][j] >= dk[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j == n - 1)
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i + 1][j] != 0 && dk[i][j] >= dk[i][j + 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
				else if (i == m - 1)
				{
					if (j == 0)
					{
						if (dk[i][j] >= dk[i][j + 1] != 0 && dk[i][j] >= dk[i - 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j == n - 1)
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i - 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i - 1][j] != 0 && dk[i][j] >= dk[i][j + 1])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
				else
				{
					if (j == 0)
					{
						if (dk[i][j] >= dk[i][j + 1] != 0 && dk[i][j] >= dk[i - 1][j] != 0 && dk[i][j] >= dk[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else if (j == n - 1)
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i - 1][j] != 0 && dk[i][j] >= dk[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
					else
					{
						if (dk[i][j] >= dk[i][j - 1] != 0 && dk[i][j] >= dk[i - 1][j] != 0 && dk[i][j] >= dk[i][j + 1] != 0 && dk[i][j] >= dk[i + 1][j])
						{
							System.out.printf("%d %d\n",i,j);
						}
					}
				}
			}
		}
		return 0;
	}
}

