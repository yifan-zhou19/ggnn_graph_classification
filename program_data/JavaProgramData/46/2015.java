package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int k = 1;
		int l = 0;
		int i;
		int j;
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
		int[][] sz = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row == 1 && col == 1)
		{
			System.out.printf("%d",sz[0][0]);
		}
		else
		{
			for (i = 0;i < row * col;)
			{
					for (j = l;j < col - l;j++)
					{
						System.out.printf("%d\n",sz[l][j]);
						i++;
						if (i == row * col)
						{
							break;
						}
					}
				if (i == row * col)
				{
					break;
				}
					for (j = l + 1;j < row - 1 - l;j++)
					{
						System.out.printf("%d\n",sz[j][col - 1 - l]);
						i++;
						if (i == row * col)
						{
							break;
						}
					}
					if (i == row * col)
					{
						break;
					}
					for (j = col - 1 - l;j >= l;j--)
					{
						System.out.printf("%d\n",sz[row - 1 - l][j]);
						i++;
						if (i == row * col)
						{
							break;
						}
					}
					if (i == row * col)
					{
						break;
					}
					for (j = row - 2 - l;j > l;j--)
					{
						System.out.printf("%d\n",sz[j][l]);
						i++;
						if (i == row * col)
						{
							break;
						}
					}
					if (i == row * col)
					{
						break;
					}
						l++;

			}
		}
		return 0;
	}

}

