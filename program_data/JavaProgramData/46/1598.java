package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int r;
		int c;
		int i;
		int j;
		int k = 1;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= r;i++)
		{
			for (j = 1;j <= c;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while ((r >= 2) && (c >= 2))
		{
			for (i = k;i <= c + k - 1;i++)
			{
				System.out.print(a[k][i]);
				System.out.print("\n");
			}
			for (i = k + 1;i <= r + k - 1;i++)
			{
				System.out.print(a[i][c + k - 1]);
				System.out.print("\n");
			}
			for (i = c + k - 2;i >= k;i--)
			{
				System.out.print(a[r + k - 1][i]);
				System.out.print("\n");
			}
			for (i = r + k - 2;i >= k + 1;i--)
			{
				System.out.print(a[i][k]);
				System.out.print("\n");
			}
			k++;
			r = r - 2;
			c = c - 2;
		}
		if ((r == 1) && (c != 1))
		{
			for (i = k;i <= c + k - 1;i++)
			{
				System.out.print(a[k][i]);
				System.out.print("\n");
			}
		}
		if ((c == 1) && (r != 1))
		{
			for (i = k;i <= r + k - 1;i++)
			{
				System.out.print(a[i][c + k - 1]);
				System.out.print("\n");
			}
		}
		if ((r == 1) && (c == 1))
		{
			System.out.print(a[k][k]);
			System.out.print("\n");
		}
		return 0;
	}



}

