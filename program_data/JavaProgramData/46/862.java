package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int a = 0;
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		while (a < row - 1 && a < col - 1)
		{
			for (i = a,j = a;j < col - 1;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			for (j = col - 1,i = a;i < row - 1;i++)
			{

				System.out.printf("%d\n",sz[i][j]);
			}
			for (i = row - 1,j = col - 1;j > a;j--)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			for (j = a,i = row - 1;i > a;i--)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			col--;
			row--;
			a++;
		}
		if (a == row - 1)
		{
			for (i = a,j = a;j < col;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
		}
		else if (a == col - 1)
		{
			for (j = a,i = a;i < row;i++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
		}

		return 0;
	}
}

