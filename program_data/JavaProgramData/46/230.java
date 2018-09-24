package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int row;
		int col;
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
		int[][] array = new int[100][100];
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
		for (k = 0;k <= row / 2 && k <= col / 2;k++)
		{


				for (j = k;j <= col - 1 - k;j++)
				{
					System.out.printf("%d\n",array[k][j]);
				}


				for (i = k + 1;i <= row - k - 1;i++)
				{
					System.out.printf("%d\n",array[i][col - 1 - k]);
				}



				if (row - 1 - k <= k)
				{
					break;
				}
				for (j = col - k - 2;j >= k;j--)
				{
					System.out.printf("%d\n",array[row - 1 - k][j]);
				}

				if (col - k - 1 <= k)
				{
					break;
				}

				for (i = row - 2 - k;i > k;i--)
				{
					System.out.printf("%d\n",array[i][k]);
				}

		}
		return 0;
	}

}

