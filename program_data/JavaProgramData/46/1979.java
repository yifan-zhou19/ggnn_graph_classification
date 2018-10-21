package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int n;
		int time = 0;
		int a;
		int b;
		int c;
		int d;
		int[][] array = new int[100][100];
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
			for (n = 0;;n++)
			{
				for (a = n;a < col - n;a++)
				{
					System.out.printf("%d\n",array[n][a]);
					time++;
				}
				if (time == row * col)
				{
					break;
				}
				for (b = n + 1;b < row - n;b++)
				{
					System.out.printf("%d\n",array[b][col - n - 1]);
					time++;
				}
				if (time == row * col)
				{
					break;
				}
				for (c = col - 2 - n;c >= n;c--)
				{
					System.out.printf("%d\n",array[row - n - 1][c]);
					time++;

				}
				if (time == row * col)
				{
					break;
				}
				for (d = row - 2 - n;d > n;d--)
				{
					System.out.printf("%d\n",array[d][n]);
					time++;
				}
				if (time == row * col)
				{
					break;
				}
			}
	}

}

