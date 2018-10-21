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
		int n;
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
		if (row > col)
		{
			n = (col + 1) / 2;
		}
		else
		{
			n = (row + 1) / 2;
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
		for (k = 1;k <= n;k++)
		{
			for (i = k - 1,j = k - 1;j <= col - k;j++)
			{
				System.out.printf("%d\n",array[i][j]);
			}
			for (j = col - k,i = k;i <= row - k;i++)
			{
				System.out.printf("%d\n",array[i][j]);
			}
			if (row - k > k - 1)
			{
				for (i = row - k,j = col - k - 1;j >= k - 1;j--)
				{
					System.out.printf("%d\n",array[i][j]);
				}
			}
			if (k - 1 < col - k)
			{
				for (j = k - 1,i = row - k - 1;i >= k;i--)
				{
					System.out.printf("%d\n",array[i][j]);
				}
			}
		}
		return 0;
	}
}

