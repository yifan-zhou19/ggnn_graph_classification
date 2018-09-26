package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[10][11][11];
		int i;
		int j;
		int k;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][5][5] = m;
		for (k = 1;k <= n;k++)
		{
						for (i = 1;i < 10;i++)
						{
						for (j = 1;j < 10;j++)
						{
										 if (a[k - 1][i][j] > 0)
										 {
														   a[k][i][j] = a[k][i][j] + a[k - 1][i][j] * 2;
														   a[k][i - 1][j] = a[k][i - 1][j] + a[k - 1][i][j];
														   a[k][i][j - 1] = a[k][i][j - 1] + a[k - 1][i][j];
														   a[k][i + 1][j] = a[k][i + 1][j] + a[k - 1][i][j];
														   a[k][i][j + 1] = a[k][i][j + 1] + a[k - 1][i][j];
														   a[k][i + 1][j + 1] = a[k][i + 1][j + 1] + a[k - 1][i][j];
														   a[k][i - 1][j - 1] = a[k][i - 1][j - 1] + a[k - 1][i][j];
														   a[k][i - 1][j + 1] = a[k][i - 1][j + 1] + a[k - 1][i][j];
														   a[k][i + 1][j - 1] = a[k][i + 1][j - 1] + a[k - 1][i][j];
										 }

						}
						}
		}
		for (i = 1;i < 10;i++)
		{
					   for (j = 1;j < 9;j++)
					   {
					   System.out.print(a[n][i][j]);
					   System.out.print(" ");
					   }
	System.out.print(a[n][i][9]);
					   System.out.print("\n");
		}
		 return 0;
	}






}

