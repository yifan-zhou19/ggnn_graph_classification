package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int x;
		int y;
		int row;
		int col;
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
		x = 0;
		y = 0;
		while (true)
		{

			for (j = y;j < col;j++)
			{
				System.out.printf("%d\n",array[x][j]);
			}

			x++;
			if (x == row)
			{
				break;
			}
			for (i = x;i < row;i++)
			{
				System.out.printf("%d\n",array[i][col - 1]);
			}

			col = col - 1;
			if (y == col)
			{
				break;
			}

			for (j = col - 1;j >= y;j--)
			{
				System.out.printf("%d\n",array[row - 1][j]);
			}
			row = row - 1;
			for (i = row - 1;i >= x;i--)
			{
				System.out.printf("%d\n",array[i][y]);
			}
			y++;
			if (x == row)
			{
				break;
			}
		}
		return 0;
	}

}

