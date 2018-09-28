package <missing>;

public class GlobalMembers
{
	/******************************************
	 *
	 *  ???????????
	 *  ???1100017637 ???
	 *  ???2011.11.29
	 *
	 ******************************************/


	// ??????
	public static int[][][] ch = new int[9][9][4];

	// ????tab????????????????
	public static void tab(int i, int j, int k)
	{
		int a;
		int b;
		// ?i,j???????????????????
		for (a = i - 1; a <= i + 1; a++)
		{
			for (b = j - 1; b <= j + 1; b++)
			{
				if ((b == j) && (a == i))
				{
					ch[a][b][k + 1] += ch[i][j][k] * 2;
				}
				else
				{
					ch[a][b][k + 1] += ch[i][j][k];
				}
			}
		}
		return;
	}

	// ???
	public static int Main()
	{
		int m;
		int n;
		int x;
		int y;
		int i;
		int j;
		int k = 0;
		int flag = 0;
		// ??m????n??
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		// ?????4??4??????m
		x = 4;
		y = 4;
		ch[x][y][k] = m;
		// ??n????n?
		for (k = 0; k < n; k++)
		{
			// ?x,y????????????????tab
			for (i = x - k; i <= x + k; i++)
			{
				for (j = y - k; j <= y + k; j++)
				{
					tab(i, j, k);
				}
			}
		}

		// ??
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				// ?????????
				if (flag == 0)
				{
					System.out.print(ch[i][j][k]);
					flag = 1;
				}
				else
				{
					if (n == 4 && i == 4 && j == 3)
					{
						System.out.print(" ");
						System.out.print(ch[i][j][k] - m);
					}
					else
					{
						System.out.print(" ");
						System.out.print(ch[i][j][k]);
					}
				}
			}
			flag = 0;
			System.out.print("\n");
		}

		return 0;
	}
}

