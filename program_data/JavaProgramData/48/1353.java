package <missing>;

public class GlobalMembers
{
	public static int[][] x = new int[9][9];
	public static int num(int i, int j, int k)
	{
		if (k == 1)
		{
			return x[i][j];
		}
		else
		{
			int t = num(i, j, k - 1);
			int[] d = {-1, 0, 1};
			int[] l = {-1, 0, 1};
			for (int p = 0; p < 3; p++)
			{
				for (int q = 0; q < 3; q++)
				{
					if ((i + d[p]) >= 0 && (i + d[p] <= 8) && (j + l[q] >= 0) && (j + l[q] <= 8))
					{
						t = t + num(i + d[p], j + l[q], k - 1);
					}
				}
			}
			 return t;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				x[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[4][4] = m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 8; j++)
			{
				System.out.print(num(i, j, n + 1));
				System.out.print(" ");
			}
			System.out.print(num(i, 8, n + 1));
			System.out.print("\n");
		}
		return 0;
	}
}

