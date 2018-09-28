package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] x = new int[100][100];
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
					x[i][j] = Integer.parseInt(tempVar3);
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
	//the 1st we will try to output the num in row=0
		for (i = k,j = k;j < col - 1 - k;j++) //x[0][0]~x[0][col-2]
		{
			System.out.printf("%d\n",x[i][j]);
		}
	//the 2nd output the num in  col=col-1
		for (i = k,j = col - 1 - k;i < row - 1 - k;i++) //x[0][col-1]~x[row-2][col-1]
		{
			System.out.printf("%d\n",x[i][j]);
		}

	//the 3rd output the num in row=row-1
		for (i = row - 1 - k,j = col - 1 - k;j > k;j--) //x[row-1][col-1]~x[row-1][1]
		{
			System.out.printf("%d\n",x[i][j]);
		}

	//the 4th outoput the num in col=0
		for (i = row - 1 - k,j = k;i > k;i--) //x[row-1][0]~x[1][0]
		{
			System.out.printf("%d\n",x[i][j]);
		}

		}
		if (col > row && row % 2 == 1)
		{
										k = row / 2;
										for (i = k,j = k;j <= col - 1 - k;j++)
										{
											System.out.printf("%d\n",x[i][j]);
										}
		}
		else if (col < row && col % 2 == 1)
		{
										k = col / 2;
										for (i = k,j = k;i <= row - 1 - k;i++)
										{
											System.out.printf("%d\n",x[i][j]);
										}
		}
		else if (col == row && col % 2 == 1 && row % 2 == 1)
		{
					 k = col / 2;
					 System.out.printf("%d\n",x[k][k]);
		}
		else
		{
			k = k;
		}


	}



}

