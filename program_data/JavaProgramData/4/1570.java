package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		for (i = 0;i < col;i++)
		{
			for (j = 0;j < row;j++)
			{
				System.out.printf("%d\n", array[j][i - j]);
				if (i - j == 0)
				{
					break;
				}
			}
		}
		for (i = 1;i < row;i++)
		{
			for (j = i;j < row;j++)
			{
				System.out.printf("%d\n",array[j][col - 1 - j + i]);
				if (col - 1 - j + i == 0)
				{
					break;
				}
			}
		}
		return 0;
	}
}

