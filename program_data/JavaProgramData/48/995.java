package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int h;
		int l;
		int[][] s = new int[9][9];
		int[][] record = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		record[4][4] = s[4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (h = 0;h < 9;h++)
			{
				for (l = 0;l < 9;l++)
				{
					if (record[h][l] != 0)
					{
							s[h][l] += record[h][l];
							s[h - 1][l - 1] += record[h][l];
							s[h][l - 1] += record[h][l];
							s[h + 1][l - 1] += record[h][l];
							s[h - 1][l] += record[h][l];
							s[h + 1][l] += record[h][l];
							s[h + 1][l + 1] += record[h][l];
							s[h][l + 1] += record[h][l];
							s[h - 1][l + 1] += record[h][l];
					}

				}
			}
			for (h = 0;h < 9;h++)
			{
				for (l = 0;l < 9;l++)
				{
					record[h][l] = s[h][l];
				}
			}
		}
		for (h = 0;h < 9;h++)
		{
					System.out.print(s[h][0]);
					for (l = 1;l < 9;l++)
					{
						System.out.print(" ");
						System.out.print(s[h][l]);
					}
					System.out.print("\n");
		}
			return 0;
	}

}

