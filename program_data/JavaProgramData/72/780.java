package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] altitude = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				altitude[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		if ((altitude[0][0] >= altitude[0][1]) && (altitude[0][0] >= altitude[1][0]))
		{
			System.out.print("0 0");
			System.out.print("\n");
		}
		for (j = 1;j < n;j++)
		{
			if ((altitude[i][j] >= altitude[i][j - 1]) && (altitude[i][j] >= altitude[i][j + 1]) && (altitude[i][j] >= altitude[i + 1][j]))
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j == 0)
				{
					if ((altitude[i][j] >= altitude[i - 1][j]) && (altitude[i][j] >= altitude[i][j + 1]) && (altitude[i][j] >= altitude[i + 1][j]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				if (j > 0)
				{
					if ((altitude[i][j] >= altitude[i - 1][j]) && (altitude[i][j] >= altitude[i][j - 1]) && (altitude[i][j] >= altitude[i][j + 1]) && (altitude[i][j] >= altitude[i + 1][j]))
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

