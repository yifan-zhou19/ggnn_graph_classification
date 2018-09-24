package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int[] col = new int[N];
		int[] row = new int[N];
		int[][][] a = new int[100][N][N];
		int c;
		int r;
		int[] sum = new int[N];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			 sum[i] = 0;
			col[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			row[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (c = 0;c < col[i];c++)
			{
				for (r = 0;r < row[i];r++)
				{
					a[i][c][r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			for (c = 0;c < row[i];c++)
			{
				sum[i] = sum[i] + a[i][0][c] + a[i][col[i] - 1][c];
			}
			for (c = 1;c < col[i] - 1;c++)
			{
				sum[i] = sum[i] + a[i][c][0] + a[i][c][row[i] - 1];
			}

			System.out.print(sum[i]);
			System.out.print("\n");


		}


		return 0;
	}

}

