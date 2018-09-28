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
		int k;
		int a;
		int b;
		int c;
		int d;
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
					(array[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < row;k++)
		{
			if (row - 1 - k - k == 1 && col - 1 - k - k == 1)
			{
				System.out.printf("%d\n%d\n%d\n%d\n",array[k][k],array[k][k + 1],array[k + 1][k + 1],array[k + 1][k]);
			break;
			}
			if (row - 1 - k - k == 0 && col - 1 - k - k == 0)
			{
				System.out.printf("%d",array[k][k]);
				break;
			}
			if (row - 1 - k - k == 1 && col - 1 - k - k == 0)
			{
				System.out.printf("%d\n%d\n",array[k][k],array[k + 1][k]);
				break;
			}

			if (row - 1 - k - k == 1 && col - 1 - k - k != 1)
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
				break;
			}
			if (row - 1 - k - k == 0)
			{
				for (i = k,j = k;j <= col - 1 - k;j++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				break;
			}
			if (col - 1 - k - k == 1)
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
				 break;
			}
			if (col - 1 - k - k == 0)
			{
				for (i = k,j = col - 1 - k;i <= row - 1 - k;i++)
				{
					System.out.printf("%d\n",array[i][j]);
				}
				break;
			}
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
		 return 0;
	}

}

