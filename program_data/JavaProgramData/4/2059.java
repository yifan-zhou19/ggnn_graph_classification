package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] u = new int[100][100];
		int i;
		int j;
		int k;
		int row;
		int col;
		int m;
		int Col;
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
					u[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.printf("%d\n",u[0][0]);
		for (k = 1;k < col;k++)
		{
			for (j = k;j >= 0;j--)
			{
				if (k > col - 1)
				{
					break;
				}
				if (k - j > row - 1)
				{
					break;
				}

				System.out.printf("%d\n",u[k - j][j]);
			}
		}



			for (k = col;k < col + row - 2;k++)
			{
			for (j = col - 1;j >= 0;j--)
			{


	if (k - j > row - 1)
	{
					break;
	}
				System.out.printf("%d\n",u[k - j][j]);



			}
			}
			if (row == 1)
			{
				;
			}
			else
			{
	   System.out.printf("%d\n",u[row - 1][col - 1]);
			}

		return 0;
	}
}

