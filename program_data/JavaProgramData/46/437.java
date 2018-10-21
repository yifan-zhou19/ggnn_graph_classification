package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
		int n;
		int col;
		int row;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
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
		if (col > row)
		{
			n = row;
		}
		else if (col < row)
		{
			n = col;
		}
		else if (col == row)
		{
			n = row;
		}
		n = n / 2 - 1;

		for (k = 0;k <= n;k++)
		{
		for (i = k,j = k;j < col - 1 - k;j++)
		{
			System.out.printf("%d\n",array[i][j]);
		}
		for (i = k,j = col - 1 - k;i < row - 1 - k;i++)
		{
			System.out.printf("%d\n",array[i][j]);
		}
		for (i = row - 1 - k,j = col - 1 - k;j > k;j--)
		{
			System.out.printf("%d\n",array[i][j]);
		}
		for (i = row - 1 - k,j = k;i > k;i--)
		{
			System.out.printf("%d\n",array[i][j]);
		}

		}
		if (col > row && row % 2 == 1)
		{
										k = row / 2;
										for (i = k,j = k;j <= col - 1 - k;j++)
										{
											System.out.printf("%d\n",array[i][j]);
										}
		}
		else if (col < row && col % 2 == 1)
		{
										k = col / 2;
										for (i = k,j = k;i <= row - 1 - k;i++)
										{
											System.out.printf("%d\n",array[i][j]);
										}
		}
		else if (col == row && col % 2 == 1 && row % 2 == 1)
		{
					 k = col / 2;
					 System.out.printf("%d\n",array[k][k]);
		}
		else
		{
			k = k;
		}


	  return 0;
	}

}

