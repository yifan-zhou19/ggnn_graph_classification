package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int sum = 0;
		int i;
		int j;
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

		for (i = 0;i < row;i++)
		{
			for (j = i;j <= col - i - 1;j++)
			{
				System.out.printf("%d\n",array[i][j]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = i + 1;j <= row - i - 1;j++)
			{
				System.out.printf("%d\n",array[j][col - i - 1]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = col - i - 1 - 1;j >= i;j--)
			{
				System.out.printf("%d\n",array[row - i - 1][j]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (j = row - i - 1 - 1;j >= i + 1;j--)
			{
				System.out.printf("%d\n",array[j][i]);
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
		}
		return 0;
	}
}

