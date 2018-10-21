package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int k;
		int e;
		int i;
		int j;
		int min;
		int[][] sz = new int[100][100];
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
				sz[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		if (col > row)
		{
		min = row;
		}
		else
		{
		min = col;
		}
		for (e = 0;e < min / 2 + 1;e++)
		{
		for (j = e;j < col - e;j++)
		{
			System.out.printf("%d\n",sz[e][j]);
		}
		if (row % 2 == 1 && e+1 > row - 2 - e)
		{
		break;
		}
		for (i = e+1;i < row - e;i++)
		{
			System.out.printf("%d\n",sz[i][col - 1 - e]);
		}
		if (col % 2 == 1 && e > col - 2 - e)
		{
		break;
		}
		for (j = col - 2 - e;j >= e;j--)
		{
			System.out.printf("%d\n",sz[row - 1 - e][j]);
		}

		for (i = row - 2 - e;i > e;i--)
		{
			System.out.printf("%d\n",sz[i][e]);
		}
		}
	}
}

