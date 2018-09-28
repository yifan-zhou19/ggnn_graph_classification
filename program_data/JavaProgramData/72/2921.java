package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] high = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				high[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					if (high[i + 1][j] <= high[i][j] != 0 && high[i][j + 1] <= high[i][j])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				if (i == 0 && j != 0)
				{
					if (high[i + 1][j] <= high[i][j] != 0 && high[i][j + 1] <= high[i][j] != 0 && high[i][j - 1] <= high[i][j])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				if (i != 0 && j == 0)
				{
					if (high[i + 1][j] <= high[i][j] != 0 && high[i][j + 1] <= high[i][j] != 0 && high[i - 1][j] <= high[i][j])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				if (i != 0 && j != 0)
				{
					if (high[i + 1][j] <= high[i][j] != 0 && high[i][j + 1] <= high[i][j] != 0 && high[i - 1][j] <= high[i][j] != 0 && high[i][j - 1] <= high[i][j])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

