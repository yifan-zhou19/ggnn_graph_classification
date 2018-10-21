package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int row;
	int col;
	int i;
	int j;
	int x = 0;
	int y;
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
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	int sum = 0;
	i = 0;
	while (sum < (row * col))
	{
		for (j = x;j < col;j++)
		{
			System.out.printf("%d\n",a[i][j]);
			sum++;
			a[i][j] = -1;
			y = j;
			if (a[i][j + 1] == -1)
			{
				break;
			}
		}
		if (sum == row * col)
		{
			break;
		}
	 for (i = i + 1;i < row;i++)
	 {
			System.out.printf("%d\n",a[i][y]);
			sum++;
			a[i][y] = -1;
			x = i;
			if (a[i + 1][y] == -1)
			{
				break;
			}
	 }
		if (sum == row * col)
		{
			break;
		}
	for (j = y - 1;j >= 0;j--)
	{
			System.out.printf("%d\n",a[x][j]);
			sum++;
			a[x][j] = -1;
			y = j;
			if (a[x][j - 1] == -1)
			{
				break;
			}
	}
		if (sum == row * col)
		{
			break;
		}
	for (i = x - 1;i > 0;i--)
	{
			System.out.printf("%d\n",a[i][y]);
			sum++;
			a[i][y] = -1;
			x = i;
			if (a[i - 1][y] == -1)
			{
				break;
			}
	}
		if (sum == row * col)
		{
			break;
		}
	}



	return 0;
	}


}

