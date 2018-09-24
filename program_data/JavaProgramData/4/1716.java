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
		int t;

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

		for (t = 0;t < col;t++)
		{
			for (i = 0;i < row;i++)
			{
				j = t - i;
				if (j < 0)
				{
					break;
				}
				System.out.printf("%d\n",array[i][j]);
			}
		}

		for (t = col;t <= col + row - 2;t++)
		{
			for (j = col - 1;;j--)
			{
				i = t - j;
				if (j < 0)
				{
					break;
				}
				if (i >= row)
				{
					break;
				}
				System.out.printf("%d\n",array[i][j]);
			}
		}

		return 0;
	}

}

