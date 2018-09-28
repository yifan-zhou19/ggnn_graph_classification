package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int m;
		int[][] sz = new int[100][100];
		int row;
		int col;
		int a;
		int b;
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
		for (a = 0;a < row;a++)
		{
			for (b = 0;b < col;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row >= col)
		{
			for (k = 0;k < col;k++)
			{
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%d\n",sz[i][k - i]);
				}
			}
			for (k = col;k < (row + col - 1);k++)
			{
				m = k - col + 1;
				for (i = 0;(i < (row - m) && i <= (k - m));i++)
				{
					System.out.printf("%d\n",sz[i + m][k - i - m]);
				}
			}
		}
		else
		{
			for (k = 0;k < row;k++)
			{
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%d\n",sz[i][k - i]);
				}
			}
			for (k = row;k < col;k++)
			{
				for (i = 0;i < row;i++)
				{
					System.out.printf("%d\n",sz[i][k - i]);
				}
			}
			for (k = col;k < row + col - 1;k++)
			{
				m = k - col + 1;
				for (i = 0;i < row - m;i++)
				{
					System.out.printf("%d\n",sz[i + m][k - i - m]);
				}
			}
		}
		return 0;
	}
}

