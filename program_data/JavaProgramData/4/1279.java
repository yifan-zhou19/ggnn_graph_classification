package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
			int i;
			int j;
			int he;

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

		for (he = 0;he < row + col - 1;he++)
		{
			for (j = he;j >= 0;j--)
			{
				if (j >= col)
				{
					continue;
				}
				i = he - j;
				if (i >= row)
				{
					continue;
				}
				System.out.printf("%d\n",array[i][j]);
			}
		}
		return 0;
	}

}

