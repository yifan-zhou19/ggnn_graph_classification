package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[][] hill = new int[25][25];
		int m = 0;
		int n = 0;
		int average = 0;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				hill[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			}
		}









		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{

					if (hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j - 1] != 0 && hill[i][j] >= hill[i][j + 1])
					{
						System.out.print(i - 1);
						System.out.print(" ");
						System.out.print(j - 1);
						System.out.print("\n");
					}


			}

		}


	return 0;
	}
}

