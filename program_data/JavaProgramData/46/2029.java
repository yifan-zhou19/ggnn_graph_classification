package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int i;
	int j;
	int time = 0;
	int n;
	int[][] a = new int[100][100];
	int max;
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
		if (row > col)
		{
			max = row;
		}
		else
		{
			max = col;
		}
		for (n = 0;n < max;n++)
		{
			for (j = n;j < col - n;j++)
			{
				System.out.printf("%d\n",a[n][j]);
				time++;
			}
				if (time == row * col)
				{
					break;
				}
			for (i = n + 1;i < row - n;i++)
			{
				System.out.printf("%d\n",a[i][col - n - 1]);
				time++;
			}
				if (time == row * col)
				{
					break;
				}
			for (j = col - n - 2;j >= n;j--)
			{
				System.out.printf("%d\n",a[row - 1 - n][j]);
				time++;
			}
				if (time == row * col)
				{
					break;
				}
			for (i = row - n - 2;i > n;i--)
			{
				System.out.printf("%d\n",a[i][n]);
				time++;
			}
				if (time == row * col)
				{
					break;
				}
		}
		return 0;
	}
}

