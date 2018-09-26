package <missing>;

public class GlobalMembers
{
	//????
	public static int[][][] bac = new int[5][11][11]; //bac???????n??i,j???????

	public static void boom(int m,int n)
	{
		int i;
		int j;
		int d1;
		int d2;
		if (n == 0) //?n=0??????
		{
			bac[n][5][5] = m;
		}
		else //?n>1?????????
		{
			boom(m, n - 1);
		}
		if (n > 0)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					bac[n][i][j] = bac[n - 1][i][j];
					for (d1 = -1; d1 <= 1; d1++)
					{
						for (d2 = -1; d2 <= 1; d2++)
						{
							bac[n][i][j] += bac[n - 1][i + d1][j + d2]; //?n>1??????????
						}
					}
				}
			}
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		boom(m, n); //?????m??????n?????
		for (i = 1; i <= 9; i++) //???????
		{
			for (j = 1; j <= 8; j++)
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

