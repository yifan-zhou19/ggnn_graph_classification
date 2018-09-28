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
		int k;
		int n;
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
		if (row > col)
		{
			n = 2 * col;
		}
		else if (row < col)
		{
			n = 2 * row;
		}
		else
		{
			n = 2 * row - 1;
		}
		for (k = 0;k < n;k++)
		{
			if (k % 4 == 0)
			{
				for (i = k / 4;i < col - k / 4;i++)
				{
					System.out.printf("%d\n",a[k / 4][i]);
				}
			}
			if (k % 4 == 1)
			{
				for (i = k / 4 + 1;i < row - k / 4;i++)
				{
					System.out.printf("%d\n",a[i][col - 1 - k / 4]);
				}
			}
			if (k % 4 == 2)
			{
				for (i = k / 4 + 1;i < col - k / 4;i++)
				{
					System.out.printf("%d\n",a[row - 1 - k / 4][col - 1 - i]);
				}
			}
			if (k % 4 == 3)
			{
				for (i = k / 4 + 1;i < row - k / 4 - 1;i++)
				{
					System.out.printf("%d\n",a[row - i - 1][k / 4]);
				}
			}
		}
		return 0;
	}
}

