package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			int row;
			int col;
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] number = new int[100][100];

			int k;
			int m;
			for (k = 0;k <= row - 1;k++)
			{
				for (m = 0;m <= col - 1;m++)
				{
					number[k][m] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			for (k = 0;k <= row - 1;k++)
			{
				for (m = 0;m <= col - 1;m++)
				{
					if (k == 0 || m == 0 || k == row - 1 || m == col - 1)
					{
						sum += number[k][m];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

