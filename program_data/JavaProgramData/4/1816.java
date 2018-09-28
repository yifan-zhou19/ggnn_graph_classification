package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
		int row;
		int col;
		int sum;
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
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row == col)
		{
			for (k = 0;k < col;k++)
			{
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%d\n",array[i][k - i]);
				}
			}
			sum = row;
			for (k = 1;k < row;k++)
			{
				for (j = k;j < row;j++)
				{
					System.out.printf("%d\n",array[j][sum - j]);
				}
				sum++;
			}
		}
		else if (col > row)
		{
			for (k = 0;k < row;k++)
			{
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%d\n",array[i][k - i]);
				}
			}
			for (k = row;k < col;k++)
			{
				for (i = 0;i < row;i++)
				{
					System.out.printf("%d\n",array[i][k - i]);
				}
			}
			sum = col - 1;
			for (k = 1;k < row;k++)
			{
				for (j = k;j < row;j++)
				{
					System.out.printf("%d\n",array[j][sum + k - j]);
				}
			}
		}
		else
		{
			for (k = 0;k < col;k++)
			{
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%d\n",array[i][k - i]);
				}
			}
			for (k = col;k < row;k++)
			{
				for (i = col - 1;i >= 0;i--)
				{
					System.out.printf("%d\n",array[k - i][i]);
				}
			}
			sum = 0;
			for (k = row;k < row + col - 1;k++)
			{
				for (i = col - 1;i > sum;i--)
				{
					System.out.printf("%d\n",array[k - i][i]);
				}
				sum++;
			}
		}
		return 0;
	}


}

