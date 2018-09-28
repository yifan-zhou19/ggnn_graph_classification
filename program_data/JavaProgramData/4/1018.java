package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int m;
		int n;
		int[][] a = new int[100][100];
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
			if (row <= col)
			{
		for (m = 0;m < row;m++)
		{
			for (n = 0;n <= m;n++)
			{
				System.out.printf("%d\n",a[n][m - n]);
			}
		}
		for (m = row;m < col;m++)
		{
			for (n = 0;n < row;n++)
			{
				System.out.printf("%d\n",a[n][m - n]);
			}
		}
		for (m = col;m < (col + row);m++)
		{
			for (n = (m - col + 1);n < row;n++)
			{
				System.out.printf("%d\n",a[n][m - n]);
			}
		}
			}
			else
			{
		for (m = 0;m < col;m++)
		{
			for (n = 0;n <= m;n++)
			{
				System.out.printf("%d\n",a[n][m - n]);
			}
		}
		for (m = col;m < row;m++)
		{
			for (n = col - 1;n >= 0;n--)
			{
				System.out.printf("%d\n",a[m - n][n]);
			}
		}
		for (m = row;m < (col + row);m++)
		{
			for (n = col - 1;n >= (m - row + 1);n--)
			{
				System.out.printf("%d\n",a[m - n][n]);
			}
		}
			}
			return 0;
	}


}

