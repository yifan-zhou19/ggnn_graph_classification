package <missing>;

public class GlobalMembers
{
	/* title :????????*
	* author : ???*
	* time : 2011.11.9 */


	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static int m;

	public static int Main()
	{
		int n;
		int l;
		int s;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		b[5][5] = m;
		for (i = 0; i < n; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				for (k = 1; k <= 9; k++)
				{
					b[j][k] = a[j][k];
				}
			}
			for (j = 1; j <= 9; j++)
			{
				for (k = 1; k <= 9; k++)
				{
					a[j][k] = 2 * b[j][k] + b[j][k - 1] + b[j][k + 1] + b[j - 1][k] + b[j + 1][k] + b[j + 1][k + 1] + b[j + 1][k - 1] + b[j - 1][k + 1] + b[j - 1][k - 1];
				}
			}
		}
		for (l = 1; l <= 9; l++)
		{
			for (s = 1; s <= 8; s++)
			{
				System.out.print(a[l][s]);
				System.out.print(" ");
			}
			System.out.print(a[l][9]);
			System.out.print("\n");
		}
		return 0;
	}


}

