package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int[][] shuzu = new int[100][100];
		int n = 0;
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
					shuzu[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row == col)
		{
			for (i = 0;i < col;i++)
			{
				for (j = 0;j < row;j++)
				{
					System.out.printf("%d\n",shuzu[j][i - j]);
					if ((i - j) == 0)
					{
						break;
					}
				}
			}
			for (i = 1;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					System.out.printf("%d\n",shuzu[i + j][col - 1 - j]);
					if ((i + j + 1) == row)
					{
						break;
					}
				}
			}
		}
		if (row > col)
		{
			for (i = 0;i < col;i++)
			{
				for (j = 0;j < row;j++)
				{
					System.out.printf("%d\n",shuzu[j][i - j]);
					if ((i - j) == 0)
					{
						break;
					}
				}
			}
			for (i = 1;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					System.out.printf("%d\n",shuzu[i + j][col - 1 - j]);
					if ((col - 1 - j) == 0)
					{
						break;
					}
					if ((i + j + 1) == row)
					{
						break;
					}
				}
			}
		}
		if (row < col)
		{
			for (i = 0;i < col;i++)
			{
				for (j = 0;j < row;j++)
				{
					System.out.printf("%d\n",shuzu[j][i - j]);
					if ((i - j) == 0)
					{
						break;
					}
				}
			}
			for (i = 1;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					System.out.printf("%d\n",shuzu[i + j][col - 1 - j]);
					if ((i + j + 1) == row)
					{
						break;
					}
				}
			}
		}
		return 0;
	}

}

