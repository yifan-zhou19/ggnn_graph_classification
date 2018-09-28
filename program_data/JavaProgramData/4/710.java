package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int L;
		int R;
		int i;
		int j;
		int k;
		R = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		L = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int l = L;
		final int r = R;
		int[][] a = new int[r][l];
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < l;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < l;k++)
		{
			for (i = 0;(i < r) && ((k - i) >= 0);i++)
			{
						System.out.print(a[i][k - i]);
						System.out.print("\n");
			}
		}
		for (k = l;k <= l + r - 2;k++)
		{
			for (i = l - 1;(i >= 0) && ((k - i) < r);i--)
			{
							System.out.print(a[k - i][i]);
							System.out.print("\n");
			}

		}
	}
}

