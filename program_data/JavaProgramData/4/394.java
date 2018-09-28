package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int[][] mat = new int[200][200];
		int i;
		int j;

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
					mat[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,j = 0;;)
		{
			if (i < row && j < col)
			{
				System.out.printf("%d\n",mat[i][j]);
			}
			if (i == row - 1 && j == col - 1)
			{
				break;
			}
			if (j == 0)
			{
				j = i + 1;
				i = 0;
			}
			else
			{
				i++;
				j--;
			}
		}
		return 0;
	}
}

