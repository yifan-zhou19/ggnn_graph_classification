package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
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
		for (n = 0;n < row - 1 + col;n++)
		{
			if (n < col)
			{
				for (i = n;((n - i) <= (row - 1)) && (i >= 0);i--)
				{
					System.out.printf("%d\n",a[n - i][i]);
				}
			}
			if (n > col - 1)
			{
				for (i = col - 1;((n - i) <= (row - 1)) && (i >= 0);i--)
				{
					System.out.printf("%d\n",a[n - i][i]);
				}
			}
		}
		return 0;
	}

}

