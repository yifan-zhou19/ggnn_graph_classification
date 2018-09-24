package <missing>;

public class GlobalMembers
{
	public static int[][] b = new int[11][11];
	public static int[][] d = new int[11][11];
	public static void breed()
	{
		int i;
		int j;
		for (i = 1;i <= 9;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				d[i][j] = b[i][j];
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				b[i][j] = d[i][j] * 2 + d[i - 1][j - 1] + d[i - 1][j] + d[i - 1][j + 1] + d[i][j - 1] + d[i][j + 1] + d[i + 1][j - 1] + d[i + 1][j] + d[i + 1][j + 1];
			}
		}
	}
	public static int Main()
	{
		int days;
		int i;
		int j;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				b[i][j] = d[i][j] = 0;
			}
		}
		b[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= days;i++)
		{
			breed();
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j == 9)
				{
					System.out.print(b[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(b[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

