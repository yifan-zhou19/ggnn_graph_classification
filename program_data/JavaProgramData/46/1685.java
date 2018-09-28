package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //row????col???
		int col;
		int i; //????
		int j;
		int[][] a = new int[100][100]; // ????????
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int m; //m???????n??????,t?????
		int n;
		int t;
		m = row;
		n = col;
		t = 0;
		for (t = 0;(t < n - t) && (t < m - t);t++)
		{
			for (i = t,j = t;j < n - t;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
			if (j == t)
			{
				break;
			}

			for (i = 1 + t,j = n - t - 1;i < m - t;i++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

			}
			if (i == 1 + t)
			{
				break;
			}

			for (i = m - t - 1,j = n - 2 - t;j >= t;j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

			}
			if (j == n - 2 - t)
			{
				break;
			}
			for (i = m - 2 - t,j = t;i >= 1 + t;i--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");

			}

		}
		return 0;

	}

}

