package <missing>;

public class GlobalMembers
{
	//***************************
	//???????				*
	//?????? 1100012895	*
	//???2011-11-23			*
	//***************************


	public static int Main()
	{
		int[][][] Ground = new int[5][11][11]; // ??????????????????
		Ground[0][5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int n; // n??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		// ????????????????????????
		int day;
		int j;
		int k;
		for (day = 1; day <= n; day++)
		{
			for (j = 5 - day; j <= 5 + day; j++)
			{
				for (k = 5 - day; k <= 5 + day; k++)
				{
					// ?????????????????????????
					Ground[day][j][k] = Ground[day - 1][j][k] * 2 + Ground[day - 1][j - 1][k - 1] + Ground[day - 1][j - 1][k] + Ground[day - 1][j - 1][k + 1] + Ground[day - 1][j][k - 1] + Ground[day - 1][j][k + 1] + Ground[day - 1][j + 1][k - 1] + Ground[day - 1][j + 1][k] + Ground[day - 1][j + 1][k + 1];
				}
			}
		}

		for (j = 1; j <= 9; j++)
		{
			System.out.print(Ground[n][j][1]);
			for (k = 2; k <= 9; k++)
			{
				System.out.print(' ');
				System.out.print(Ground[n][j][k]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}

