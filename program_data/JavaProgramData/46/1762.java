package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int state;
		int[][] sz = new int[100][100];
		int[][] zt = new int[100][100];
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		state = 0;
		i = 0;
		j = 0;
		if (row >= 2 && col >= 2)
		{
			while (true)
			{
			if (zt[i][j] == 1)
			{
				break;
			}
			else
			{
				if (state == 0 && j + 1 < col && zt[i][j + 1] == 0)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					j++;
				}
				else if (state == 0)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					i++;
					state = 1;
				}
				else if (state == 1 && i + 1 < row && zt[i + 1][j] == 0)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					i++;
				}
				else if (state == 1)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					j--;
					state = 2;
				}
				else if (state == 2 && j - 1 >= 0 && zt[i][j - 1] == 0)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					j--;
				}
				else if (state == 2)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					i--;
					state = 3;
				}
				else if (state == 3 && i - 1 >= 0 && zt[i - 1][j] == 0)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					i--;
				}
				else if (state == 3)
				{
					System.out.printf("%d\n",sz[i][j]);
					zt[i][j] = 1;
					j++;
					state = 0;
				}
			}
			}
		}
		else if (row == 1 && col == 1)
		{
			System.out.printf("%d\n",sz[0][0]);
		}
		else if (row == 1 && col >= 2)
		{
			for (i = 0; i < col;i++)
			{
				System.out.printf("%d\n",sz[0][i]);
			}
		}
		else if (row >= 2 && col == 1)
		{
			for (i = 0;i < row;i++)
			{
				System.out.printf("%d\n",sz[i][0]);
			}
		}
		return 0;
	}
}

