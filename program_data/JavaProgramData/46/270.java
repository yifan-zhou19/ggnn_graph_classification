package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
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
		int[][] array = new int[100][100];
		int i;
		int j;
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
		int n;
		int N;
		int time = 0;
		int m1;
		int m2;
		m1 = (int)Math.ceil(1.0 * row / 2);
		m2 = (int)Math.ceil(1.0 * col / 2);
		if (m1 < m2)
		{
			N = m1;
		}
		else
		{
			N = m2;
		}
		for (n = 0;n < N;n++)
		{
			for (j = n;j < col - n;j++)
			{
				if (time < row * col)
				{
				System.out.printf("%d\n",array[n][j]);
				time++;
				}
			}
			for (i = n + 1;i < row - n;i++)
			{
				if (time < row * col)
				{
				System.out.printf("%d\n",array[i][col - n - 1]);
				time++;

				}
			}
			for (j = col - n - 2;j >= n;j--)
			{
				if (time < row * col)
				{
				System.out.printf("%d\n",array[row - n - 1][j]);
				time++;

				}
			}
			for (i = row - n - 2;i > n;i--)
			{
				if (time < row * col)
				{
				System.out.printf("%d\n",array[i][n]);
				time++;

				}
			}
		}
		return 0;
	}
}

