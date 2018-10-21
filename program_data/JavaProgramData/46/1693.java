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
		int n = 0;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= r; i++)
		{
			for (j = 1; j <= c; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		j = 1;
		i = 0;
		while ((2 * n < c - 1) && (2 * n < r - 1))
		{
			for (i = 1 + n; i <= c - n; i++)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
			}
			i--;
			for (j = j + 1; j <= r - n; j++)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
			}
			j--;
			for (i = i - 1; i >= 1 + n; i--)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
			}
			i++;
			for (j = j - 1; j > 1 + n; j--)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
			}
			j++;
			n++;
		}
		if (2 * n == r - 1)
		{
			for (i = 1 + n; i <= c - n; i++)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
			}
		}
		else if (2 * n == c - 1)
		{
			for (j = j; j <= r - n; j++)
			{
				System.out.print(a[j][i + 1]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

