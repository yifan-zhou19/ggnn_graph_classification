package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[MAXSIZE][MAXSIZE];
		int i;
		int j;
		int row;
		int col;
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
		for (n = 0;n <= col + row - 2;n++)
		{
			for (i = 0;i < row;i++)
			{
				if (i <= n != 0 && i> n - col)
				{
				System.out.printf("%d\n",a[i][n - i]);
				}
			}
		}
	}
}

