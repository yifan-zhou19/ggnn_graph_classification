package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
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
		int[][] a = new int[100][100];
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
		for (j = 0;j < col;j++)
		{
			for (i = 0;i < j + 1;i++)
			{
				if (i < row)
				{
					System.out.printf("%d\n",a[i][j - i]);
				}

			}
		}
		for (k = col;k < row + col - 1;k++)
		{
			for (j = col - 1;j >= 0;j--)
			{
				if (k - j < row)
				{
					System.out.printf("%d\n",a[k - j][j]);
				}
			}
		}
		return 0;

	}
}

