package <missing>;

public class GlobalMembers
{
	/*
	??1
	?? ????
	?? ??? 1300012786 
	*/
	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int[][] c = new int[102][102];
		int n;
		int q;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				c[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < q; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < q; i++)
		{
			for (int j = 0; j < m; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				for (int l = 0; l < q; l++)
				{
					c[i][j] += a[i][l] * b[l][j];
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m - 1; j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][m - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

