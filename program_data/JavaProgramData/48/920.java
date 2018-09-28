package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[9][9];
		int t;
		num[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;i++)
		{
			int[][] beifen = new int[9][9];
			for (int j = 0;j < 9;j++)
			{
				for (int k = 0;k < 9;k++)
				{
					if (num[j][k] != 0)
					{
						beifen[j][k] += num[j][k] * 2;
						beifen[j][k + 1] += num[j][k];
						beifen[j][k - 1] += num[j][k];
						beifen[j + 1][k + 1] += num[j][k];
						beifen[j - 1][k + 1] += num[j][k];
						beifen[j - 1][k - 1] += num[j][k];
						beifen[j + 1][k - 1] += num[j][k];
						beifen[j + 1][k] += num[j][k];
						beifen[j - 1][k] += num[j][k];
					}
				}
			}
			for (int j = 0;j < 9;j++)
			{
				for (int k = 0;k < 9;k++)
				{
					num[j][k] = beifen[j][k];
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 8;j++)
			{
				System.out.print(num[i][j]);
				System.out.print(' ');
			}
			System.out.print(num[i][8]);
			System.out.print("\n");
		}

		return 0;
	}
}

