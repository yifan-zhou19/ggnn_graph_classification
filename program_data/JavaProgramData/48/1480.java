package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int day;
		int[][] ma = new int[11][11];
		int[][] mb = new int[11][11];
		ma[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int t = 1;t <= day;t++)
		{
			if (t % 2 == 1)
			{
				for (int i = 1;i < 10;i++)
				{
					for (int j = 1;j < 10;j++)
					{
						mb[i][j] = ma[i][j] * 2 + ma[i + 1][j] + ma[i + 1][j + 1] + ma[i + 1][j - 1] + ma[i - 1][j] + ma[i - 1][j + 1] + ma[i - 1][j - 1] + ma[i][j + 1] + ma[i][j - 1];
					}
				}
			}
			else
			{
				for (int i = 1;i <= 9;i++)
				{
					for (int j = 1;j <= 9;j++)
					{
						ma[i][j] = mb[i][j] * 2 + mb[i + 1][j] + mb[i + 1][j + 1] + mb[i + 1][j - 1] + mb[i - 1][j] + mb[i - 1][j + 1] + mb[i - 1][j - 1] + mb[i][j + 1] + mb[i][j - 1];
					}
				}
			}
		}

		if (day % 2 == 1)
		{
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j < 9;j++)
				{
					System.out.print(mb[i][j]);
					System.out.print(" ");
				}
				System.out.print(mb[i][9]);
				System.out.print("\n");
			}
		}
		else
		{
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j < 9;j++)
				{
					System.out.print(ma[i][j]);
					System.out.print(" ");
				}
				System.out.print(ma[i][9]);
				System.out.print("\n");
			}
		}
	}

}

