package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;

	public static void num(int[][] a, int[][] b, int c)
	{
		int w;
		for (w = 0;w < 11;w++)
		{
			a[0][w] = 0;
			a[w][0] = 0;
			b[0][w] = 0;
			b[w][0] = 0;
			a[10][w] = 0;
			a[w][10] = 0;
			b[10][w] = 0;
			b[w][10] = 0;
		}
		int i;
		int j;
		int p;
		int q;
		if (c == n + 1)
		{
			for (p = 1;p <= 9;p++)
			{
			   for (q = 1;q <= 8;q++)
			   {
					 System.out.print(m * a[p][q]);
					 System.out.print(" ");
			   }
				System.out.print(m * a[p][9]);
				System.out.print("\n");
			}
			return;
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
				}
			}
			num(b, a, c + 1);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int[][] bac1 = new int[11][11];
		int[][] bac2 = new int[11][11];
		bac1[5][5] = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num(bac1, bac2, 1);
		return 0;
	}




}

