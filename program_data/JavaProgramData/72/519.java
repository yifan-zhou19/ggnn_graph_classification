package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[30][20];
		int i;
		int j;
		int m;
		int n;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 00 && j == 0)
				{
					if (array[i][j] >= array[i + 1][j] != 0 && array[i][j] >= array[i][j + 1])
					{
						System.out.print("0 0\n");
					}
				}
				if (i == 0 && j != 0 && j != n - 1)
				{
					if (array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i][j + 1] != 0 && array[i][j] >= array[i + 1][j])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i == 0 && j == n - 1)
				{
					if (array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i + 1][j])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i != 0 && i != m - 1 && j == 0)
				{
					if (array[i][j] >= array[i - 1][j] != 0 && array[i][j] >= array[i + 1][j] != 0 && array[i][j] >= array[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i != 0 && j != 0 && i != m - 1 && j != n - 1)
				{
					if (array[i][j] >= array[i - 1][j] != 0 && array[i][j] >= array[i + 1][j] != 0 && array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i != 0 && i != m - 1 && j == n - 1)
				{
					if (array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i + 1][j] != 0 && array[i][j] >= array[i - 1][j])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i == m - 1 && j == 0)
				{
					if (array[i][j] >= array[i - 1][j] != 0 && array[i][j] >= array[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i == m - 1 && j != 0 && j != n - 1)
				{
					if (array[i][j] >= array[i - 1][j] != 0 && array[i][j] >= array[i][j - 1] != 0 && array[i][j] >= array[i][j + 1])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				if (i == m - 1 && j == n - 1)
				{
					if (array[i][j] >= array[i - 1][j] != 0 && array[i][j] >= array[i][j - 1])
					{
						System.out.printf("%d %d",i,j);
					}
				}
			}
		}
		return 0;
	}
}

