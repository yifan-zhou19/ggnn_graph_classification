package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int a;
		int b;
		int[][] sz = new int[100][100];
		int[] sum = new int[100];

		for (row = 0;row < 100;row++)
		{
			sum[row] = 0;
		}

		for (row = 0;row < 100;row++)
		{
			for (col = 0;col < 100;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
				if (sz[row][col] == 0)
				{
					break;
				}
				if (sz[row][0] == -1)
				{
					break;
				}
			}
			if (sz[row][0] == -1)
			{
				break;
			}
			a = row;
		}

		for (row = 0;row <= a;row++)
		{
			for (b = 0;b < 100;b++)
			{
				for (col = 0;col < 100;col++)
				{
					if (sz[row][b] == 2 * sz[row][col] && sz[row][b] != 0 && sz[row][col] != 0)
					{
						sum[row]++;
					}
				}
			}
		}

		for (row = 0;row <= a;row++)
		{
			System.out.printf("%d\n",sum[row]);
		}

		return 0;
	}
}

