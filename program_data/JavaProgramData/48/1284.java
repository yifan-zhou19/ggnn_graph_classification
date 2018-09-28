package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????(11.8) ????????   **
	//*?????? 1300012745 **
	//*???2013.12.5  **
	//*******************************

	public static int[][][] germs = new int[4][9][9]; //????????????????????

	public static void reproduction(int i, int n) //i????
	{
		int j; //??????
		int k;
		int x;
		int y;
		if (i == n) //????n????
		{
			return;
		}
		for (x = 0; x <= 8; x++)
		{
			for (y = 0; y <= 8; y++)
			{
				for (j = -1; j <= 1; j++)
				{
					for (k = -1; k <= 1; k++)
					{
						germs[i + 1][x + j][y + k] += germs[i][x][y]; //???????????????
					}
				}
				germs[i + 1][x][y] += germs[i][x][y]; //?????????????????
			}
		}
		reproduction(i + 1, n); //??????
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 8; j++)
			{
				for (k = 0; k <= 8; k++)
				{
					germs[i][j][k] = 0; //??
				}
			}
		}
		germs[0][4][4] = m; //???
		reproduction(0, n); //??????
		for (i = 0; i <= 8; i++)
		{
			for (j = 0; j <= 8; j++)
			{
				if (j == 8)
				{
					System.out.print(germs[n][i][j]);
				}
				else
				{
					System.out.print(germs[n][i][j]);
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}




}

