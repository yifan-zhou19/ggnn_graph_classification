package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int r;
		int c;
		int r1;
		int c1;
		int i;
		int l;
		int j;
		int k;
		int m;
		int n;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0; m <= 100; m++)
		{
			for (n = 0; n <= 100; n++)
			{
				a[m][n] = -1;
			}
		}
		for (i = 1; i <= r; i++)
		{
			for (j = 1; j <= c; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 1; k <= c; k++)
		{
			c1 = k;
			r1 = 1;
			while (a[r1][c1] > 0)
			{
				System.out.print(a[r1++][c1--]);
				System.out.print("\n");
			}
		}
		for (l = 2; l <= r; l++)
		{
			c1 = c;
			r1 = l;
			while (a[r1][c1] > 0)
			{
				System.out.print(a[r1++][c1--]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

