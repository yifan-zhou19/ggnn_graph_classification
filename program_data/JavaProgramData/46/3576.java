package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] r = {0, 1, 0, -1};
		int[] c = {1, 0, -1, 0};
		int row;
		int col;
		int i = 0;
		int j = 0;
		int k = 0;
		int x = r[0];
		int y = c[0];
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
		int[][] array = new int[row][col];
		for (int a = 0;a < row;a++)
		{
			for (int b = 0;b < col;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(array[a][b]) = Integer.parseInt(tempVar3);
				}
			}
		}


		for (i = 0;i < row * col;i++,j += x,k += y)
		{
			System.out.printf("%d\n",array[j][k]);
			if (x == r[0] && y == c[0] && j + k == col - 1)
			{
				x = r[1];
				y = c[1];
			}
			else if (x == r[1] && y == c[1] && j - k == row - col)
			{
				x = r[2];
				y = c[2];
			}
			else if (x == r[2] && y == c[2] && j + k == row - 1)
			{
				x = r[3];
				y = c[3];
			}
			else if (x == r[3] && y == c[3] && j == k + 1)
			{
				x = r[0];
				y = c[0];
			}
		}
		return 0;
	}


}

