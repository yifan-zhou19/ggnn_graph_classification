package <missing>;

public class GlobalMembers
{
	/**
	 * @file   2.cpp
	 * @author 3&#194;&#203;&#188;&#189;�
	 * @date   2013-12-04
	 * @description
	 *         &#188;&#198;&#203;&#227;&#184;&#197;&#194;&#219;���??o�y�a(11.8) &#207;&#184;&#190;�?&#196;��&#214;3�&#235;�&#169;�?
	 */


	public static int[][] a = new int[10][10];
	public static void func(int day)
	{
		if (day == 0)
		{
			return;
		}
		int[][] b = new int[10][10];
		for (int i = 1; i <= 9; ++i)
		{
			for (int j = 1; j <= 9; ++j)
			{
				if (a[i][j] != 0)
				{
					b[i][j] += a[i][j];
					for (int p = i - 1; p <= i + 1; ++p)
					{
						for (int q = j - 1; q <= j + 1; ++q)
						{
							b[p][q] += a[i][j];
						}
					}
				}
			}
		}

		for (int i = 1; i <= 9; ++i)
		{
			for (int j = 1; j <= 9; ++j)
			{
				a[i][j] = b[i][j];
			}
		}

		func(day - 1);
	}

	public static int Main()
	{
		int day;
		a[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		func(day);

		for (int i = 1; i <= 9; ++i)
		{
			for (int j = 1; j <= 8; ++j)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

