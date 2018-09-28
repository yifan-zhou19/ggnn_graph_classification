package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] num = new int[5][11][11];
		int day;
		int pri;
		for (int i = 0;i <= 10;i++)
		{
			for (int j = 0;j <= 10;j++)
			{
				for (int b = 0;b <= 4;b++)
				{
					num[b][i][j] = 0;
				}
			}
		}
		pri = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[1][5][5] = pri;
		for (int t = 1;t <= day;t++)
		{
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					num[t + 1][i][j] = num[t][i][j] * 2 + num[t][i - 1][j] + num[t][i - 1][j - 1] + num[t][i - 1][j + 1] + num[t][i][j - 1] + num[t][i][j + 1] + num[t][i + 1][j] + num[t][i + 1][j - 1] + num[t][i + 1][j + 1];
				}
			}
		}
		for (int i = 1;i <= 9;i++)
		{
			for (int j = 1;j < 9;j++)
			{
				System.out.print(num[day + 1][i][j]);
				System.out.print(" ");
			}
			System.out.print(num[(day + 1)][i][9]);
			System.out.print("\n");
		}

		return 0;
	}
}

