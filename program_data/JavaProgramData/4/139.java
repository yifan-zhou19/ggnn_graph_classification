package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int row;
		int col;
		int[][] a = new int[1000][1000];
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
		for (n = 0;n <= col - 1;n++)
		{
			for (j = n;(j >= 0) && (n - j) <= (row - 1);j--)
			{
				System.out.printf("%d\n",a[n - j][j]);
			}
		}
		for (n = col;n <= row + col - 2;n++)
		{
			for (j = col - 1;(j >= 0) && (n - j) <= (row - 1);j--)
			{
				System.out.printf("%d\n",a[n - j][j]);
			}
			j = col - 1;
		}
	}
}

