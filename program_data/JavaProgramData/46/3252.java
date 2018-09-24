package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int row;
		int col;
		int i;
		int j;
		int k;
		int l = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
		}

		for (i = 1;l < row * col;i++)
		{
		k = i % 4;
		if (k == 1)
		{
				if (s < col - s - 1)
				{
					for (j = s;j < col - s - 1;j++)
					{
					System.out.printf("%d\n",a[s][j]);
					l++;
					if (l == row * col)
					{
						break;
					}
					}
				}
				if (s == col - s - 1)
				{
					continue;
				}
		}

		if (k == 2)
		{
				if (s < row - s - 1)
				{
					for (j = s;j < row - s - 1;j++)
					{
					System.out.printf("%d\n",a[j][col - s - 1]);
					l++;
					if (l == row * col)
					{
						break;
					}
					}
				}
				if (s == row - s - 1)
				{
					continue;
				}
		}

		if (k == 3)
		{
				if (s < col - s - 1)
				{
					for (j = col - s - 1;j > s;j--)
					{
					System.out.printf("%d\n",a[row - s - 1][j]);
					l++;
					if (l == row * col)
					{
						break;
					}
					}
				}
				if (s == col - s - 1)
				{
					continue;
				}
		}

		if (k == 0)
		{
				if (s < row - s - 1)
				{
					for (j = row - s - 1;j > s;j--)
					{
					System.out.printf("%d\n",a[j][s]);
					l++;
					if (l == row * col)
					{
						break;
					}
					}
				}
				if (s == row - s - 1 && l == row * col - 1)
				{
					System.out.printf("%d\n",a[s][s]);
					l++;
				}
				if (s == row - s - 1 && l != row * col - 1)
				{
					continue;
				}
		}

		if (k == 0)
		{
			s++;
		}

		}
		return 0;
	}
}

