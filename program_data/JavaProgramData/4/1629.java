package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] k = new int[100][100];
		int m = 0;
		int x = 0;
		int i;
		int j;
		int row = 0;
		int col = 0;
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
					k[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (m = 0;m < row + col - 1;m++)
		{
			for (j = m;;j--)
			{
				if (j >= col != 0 || m - j >= row)
				{
					break;
				}
				if (j < 0 || m - j < 0)
				{
					break;
				}
				System.out.printf("%d\n",k[m - j][j]);
			}
		}
		for (m = col;m < row + col - 1;m++)
		{
			for (j = col - 1;j >= 0;j--)
			{
				if (m - j >= row)
				{
					break;
				}
				System.out.printf("%d\n",k[m - j][j]);
			}
		}
		return 0;
	}

}

