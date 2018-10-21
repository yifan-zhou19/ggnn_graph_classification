package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int count;
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
		count = 0;
		for (n = 0;;n++)
		{
			for (i = n;i < col - n;i++)
			{
				System.out.printf("%d\n",array[n][i]);
				count++;
			}
			for (j = n + 1;j < row - n;j++)
			{
				System.out.printf("%d\n",array[j][col - n - 1]);
				count++;
			}
			if (count == row * col)
			{
				break;
			}
			for (i = col - 2 - n;i >= n;i--)
			{
				System.out.printf("%d\n",array[row - n - 1][i]);
				count++;
			}
			for (j = row - 2 - n;j > n;j--)
			{
				System.out.printf("%d\n",array[j][n]);
				count++;
			}
		}
		return 0;
	}
}

