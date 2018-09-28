package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int i;
		int j;
		int[][] array = new int[100][100];
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
		for (i = 0;i < row + col;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (j > row - 1 || i - j > col - 1)
				{
					continue;
				}
				if (j < row && i - j < col)
				{
					System.out.printf("%d\n",array[j][i - j]);
				}
			}
		}
	}

}

