package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e;
		int[][] array = new int[100][100];
		int col;
		int row;
		int n = 0;
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
			for (e = 0;e < col;e++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][e] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		while (n < col * row)
		{
			for (e = 0;e < col;e++)
			{
				if (array[i][e] != 0)
				{
					System.out.printf("%d\n",array[i][e]);
					array[i][e] = 0;
					n++;
				}
			}
			for (e = 0;e < row;e++)
			{
				if (array[e][col - 1 - i] != 0)
				{
					System.out.printf("%d\n",array[e][col - 1 - i]);
					array[e][col - 1 - i] = 0;
					n++;
				}
			}
			for (e = 1;e <= col;e++)
			{
				if (array[row - i - 1][col - e] != 0)
				{
					System.out.printf("%d\n",array[row - 1 - i][col - e]);
					array[row - 1 - i][col - e] = 0;
					n++;
				}
			}
			for (e = 1;e <= row;e++)
			{
				if (array[row - e][i] != 0)
				{
					System.out.printf("%d\n",array[row - e][i]);
					array[row - e][i] = 0;
					n++;
				}
			}
			i++;

		}
		return 0;
	}
}

