package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//???????
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int[][][] sqare = new int[2][11][11]; //[2]??????????????????????,[9][9]???[2][2]?????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0; j < 2; j++)
		{
		for (k = 1; k <= 9; k++)
		{
		for (l = 1; l <= 9; l++)
		{
			sqare[j][k][l] = 0;
		}
		}
		}
		sqare[0][5][5] = m;
		for (i = 0; i < n; i++) //??
		{
			//??????????
			for (k = 1; k <= 9; k++)
			{
			for (l = 1; l <= 9; l++)
			{
				sqare[1][k][l] += 2 * sqare[0][k][l];
				sqare[1][k - 1][l] += sqare[0][k][l];
				sqare[1][k + 1][l] += sqare[0][k][l];
				sqare[1][k][l + 1] += sqare[0][k][l];
				sqare[1][k][l - 1] += sqare[0][k][l];
				sqare[1][k - 1][l - 1] += sqare[0][k][l];
				sqare[1][k - 1][l + 1] += sqare[0][k][l];
				sqare[1][k + 1][l - 1] += sqare[0][k][l];
				sqare[1][k + 1][l + 1] += sqare[0][k][l];
			}
			}
			//?????????
			for (k = 1; k <= 9; k++)
			{
			for (l = 1; l <= 9; l++)
			{
				sqare[0][k][l] = sqare[1][k][l];
			}
			}

			//?0
			for (k = 1; k <= 9; k++)
			{
			for (l = 1; l <= 9; l++)
			{
				sqare[1][k][l] = 0;
			}
			}
		}
		//??
		for (k = 1; k <= 9; k++)
		{
			for (l = 1; l <= 9; l++)
			{
				if (l == 1)
				{
					System.out.print(sqare[0][k][l]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(sqare[0][k][l]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

