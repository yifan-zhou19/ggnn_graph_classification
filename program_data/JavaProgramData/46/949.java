package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] array = new int[100][100];
		int n;
		int row;
		int col;
		int i;
		int j;
		int k = 0;
		int r;
		int t;
		int x = 0;
		float m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row > col)
		{
			n = col;
		}
		else
		{
			n = row;
		}
		m = (float)n;
			while (k < m / 2)
			{
				for (j = k;j < col - k;j++)
				{
					if (x != row * col)
					{
						System.out.printf("%d\n",array[k][j]);
						x++;
					}
				}
				for (i = k + 1;i < row - 1 - k;i++)
				{
					if (x != row * col)
					{
						System.out.printf("%d\n",array[i][col - k - 1]);
						x++;
					}
				}
				for (t = col - k - 1;t > k;t--)
				{
					if (x != row * col)
					{
						System.out.printf("%d\n",array[row - k - 1][t]);
						x++;
					}
				}
				for (r = row - 1 - k;r > k;r--)
				{
					if (x != row * col)
					{
						System.out.printf("%d\n",array[r][k]);
						x++;
					}
				}
				k++;
			}
	}

}

