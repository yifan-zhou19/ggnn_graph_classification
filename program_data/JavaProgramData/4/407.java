package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[100][100];
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int m;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (m = 0;m < row + col - 1;m++)
		{
			if (m < col)
			{
			for (i = 0;i <= m != 0 && i < row;i++)
			{
				System.out.printf("%d\n",array[i][m - i]);
			}
			}
			else
			{
				for (j = col - 1;j > m - row && j >= 0;j--)
				{
					System.out.printf("%d\n",array[m - j][j]);
				}
			}

		}
		return 0;
	}


}

