package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int group = 0;
		int row = 0;
		int col = 0;
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum = 0;

		group = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (group-- != 0)
		{
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < row;i++) //??
			{
				for (j = 0;j < col;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			if (row == 1 && col == 1)
			{
				sum = a[0][0]; //????
			}
			else
			{
				for (i = 0;i < col;i++) //??????????
				{
						sum += a[0][i];
						if (row > 1)
						{
							sum += a[row - 1][i];
						}
				}
				for (i = 1;i <= row - 2;i++) //????????????
				{
						sum += a[i][0];
						if (col > 1)
						{
							sum += a[i][col - 1];
						}
				}
			}
			System.out.print(sum);
			System.out.print("\n");

		}
	}

}

