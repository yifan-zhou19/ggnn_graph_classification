package <missing>;

public class GlobalMembers
{
	/*
	*??? 1200012851
	*???????
	*2013.1.4
	**/

	public static int Main()
	{
		int[][][] a = new int[2][11][11];
		int t;
		int i;
		int k;
		int j;
		int n;
		int days;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][5][5] = n;
		for (t = 1; t <= days; t++)
		{
			i = t % 2;
			for (k = 0; k < 11; k++)
			{
				for (j = 0; j < 11; j++)
				{
					a[i][k][j] = 0;
				}
			}
			for (k = 1; k <= 9; k++)
			{
				for (j = 1; j <= 9; j++)
				{
					a[i][k][j] += 2 * a[1 - i][k][j];
					a[i][k + 1][j] += a[1 - i][k][j];
					a[i][k - 1][j] += a[1 - i][k][j];
					a[i][k][j + 1] += a[1 - i][k][j];
					a[i][k][j - 1] += a[1 - i][k][j];
					a[i][k + 1][j + 1] += a[1 - i][k][j];
					a[i][k - 1][j - 1] += a[1 - i][k][j];
					a[i][k - 1][j + 1] += a[1 - i][k][j];
					a[i][k + 1][j - 1] += a[1 - i][k][j];
				}
			}
		}
		for (k = 1; k <= 9; k++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (flag != 0)
				{
					System.out.print(" ");
				}
				System.out.print(a[i][k][j]);
				flag = 1;
			}
			flag = 0;
			System.out.print("\n");
		}
		return 0;
	}



}

