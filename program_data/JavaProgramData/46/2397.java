package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
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
		int[][] array = new int[100][100];
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int k;
		int r;
		int sum;
		sum = row * col;
		r = -1;
		while (r < 10000)
		{
			if (sum == 1)
			{
				System.out.printf("%d",array[r + 1][r + 1]);
				sum--;
			}
			if (sum == 0)
			{
				break;
			}
			r++;
			if (col > 1)
			{
				for (k = r;k < col - 1;k++)
				{
					System.out.printf("%d\n",array[r][k]);
					sum--;
					if (sum == 0)
					{
						break;
					}
				}
			}
			if (sum == 0)
			{
				break;
			}
			if (row > 1)
			{
				for (k = r;k < row - 1;k++)
				{
					System.out.printf("%d\n",array[k][col - 1]);
					sum--;
					if (sum == 0)
					{
						break;
					}
				}
			}
			if (sum == 0)
			{
				break;
			}
			if (col > 1)
			{
				for (k = col - 1;k > r;k--)
				{
					System.out.printf("%d\n",array[row - 1][k]);
					sum--;
					if (sum == 0)
					{
						break;
					}
				}
			}
			if (sum == 0)
			{
				break;
			}
			if (row > 1)
			{
				for (k = row - 1;k > r;k--)
				{
					System.out.printf("%d\n",array[k][r]);
					sum--;
					if (sum == 0)
					{
						break;
					}
				}
			}
			if (sum == 0)
			{
				break;
			}
			col--;
			row--;
		}
		return 0;
	}

}

