package <missing>;

public class GlobalMembers
{
	public static int[][] now = new int[9][9];
	public static int[][] add = new int[9][9];
	public static void getadd()
	{
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				add[i][j] = 0;
			}
		}
		for (int i = 1;i < 8;i++)
		{
			for (int j = 1;j < 8;j++)
			{
				add[i - 1][j - 1] += now[i][j];
				add[i][j - 1] += now[i][j];
				add[i + 1][j - 1] += now[i][j];
				add[i - 1][j + 1] += now[i][j];
				add[i][j + 1] += now[i][j];
				add[i + 1][j + 1] += now[i][j];
				add[i + 1][j] += now[i][j];
				add[i - 1][j] += now[i][j];


			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		now[4][4] = m;
		for (int k = 0;k < n;k++)
		{
			getadd();
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					now[i][j] = 2 * now[i][j] + add[i][j];
				}
			}

		}

		for (int i = 0;i < 9;i++)
		{
			if (i != 0)
			{
				System.out.print("\n");
			}
			for (int j = 0;j < 9;j++)
			{
				if (j != 0)
				{
					System.out.print(" ");
				}
				System.out.print(now[i][j]);
			}
		}


	}
}

