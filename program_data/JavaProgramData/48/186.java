package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[100][11][11];
		int n;
		int t;
		int i;
		int j;
		int k;
		for (i = 0;i < 100;i++)
		{
		  for (j = 0;j <= 10;j++)
		  {
			  for (k = 0;k <= 10;k++)
			  {
				  a[i][j][k] = 0;
			  }
		  }
		}

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			a[0][5][5] = n;
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[i + 1][j][k] = 2 * a[i][j][k] + a[i][j - 1][k] + a[i][j + 1][k] + a[i][j][k - 1] + a[i][j][k + 1] + a[i][j - 1][k - 1] + a[i][j + 1][k + 1] + a[i][j - 1][k + 1] + a[i][j + 1][k - 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j == 1)
				{
					System.out.print(a[t][i][j]);
				}
				else if (j > 0 && j < 9)
				{
					System.out.print(' ');
					System.out.print(a[t][i][j]);
				}
				else if (j == 9)
				{
					System.out.print(' ');
					System.out.print(a[t][i][j]);
					System.out.print("\n");
				}
			}
		}


		return 0;
	}


}

