package <missing>;

public class GlobalMembers
{
	//********************************
	//*??:????**
	//*????? 1300012839 **
	//*???2013.12.6**
	//********************************                                        //??????????
	public static int Main()
	{
		int[][][] bac = new int[5][13][13]; //????????????????????
		int m;
		int n;
		int day;
		int i;
		int j;
		int k;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bac[0][5][5] = m;
		for (day = 1;day <= n;day++) //????
		{
			for (int i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					bac[day][i][j] = bac[day - 1][i - 1][j - 1] + bac[day - 1][i - 1][j] + bac[day - 1][i - 1][j + 1] + bac[day - 1][i][j - 1] + bac[day - 1][i][j + 1] + bac[day - 1][i + 1][j - 1] + bac[day - 1][i + 1][j] + bac[day - 1][i + 1][j + 1] + 2 * bac[day - 1][i][j]; //??????n??????????
				}
			}
		}
		for (i = 1;i <= 9;i++) //????
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.print(bac[n][i][j]);
				System.out.print(' ');
			}
				System.out.print(bac[n][i][9]);
				System.out.print("\n");
		}
		return 0;
	}

}

