package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int t;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		int i;
		int k;
		int l;
		for (i = 0;i < t;i++)
		{

			for (k = 0;k < 9;k++)
			{
				for (l = 0;l < 9;l++)
				{
					if (a[k][l] != 0)
					{
						b[k][l] = b[k][l] + a[k][l] * 2;
						if (k > 0)
						{
							b[k - 1][l] = b[k - 1][l] + a[k][l];
						}
						if (k < 8)
						{
							b[k + 1][l] = b[k + 1][l] + a[k][l];
						}
						if (l > 0)
						{
							b[k][l - 1] = b[k][l - 1] + a[k][l];
						}
						if (l < 8)
						{
							b[k][l + 1] = b[k][l + 1] + a[k][l];
						}
						if (k > 0 && l > 0)
						{
							b[k - 1][l - 1] = b[k - 1][l - 1] + a[k][l];
						}
						if (k > 0 && l < 8)
						{
							b[k - 1][l + 1] = b[k - 1][l + 1] + a[k][l];
						}
						if (k < 8 && l>0)
						{
							b[k + 1][l - 1] = b[k + 1][l - 1] + a[k][l];
						}
						if (k < 8 && l < 8)
						{
							b[k + 1][l + 1] = b[k + 1][l + 1] + a[k][l];
						}

					}
				}
			}
			for (k = 0;k < 9;k++)
			{
				for (l = 0;l < 9;l++)
				{
					a[k][l] = b[k][l];
					b[k][l] = 0;
				}
			}
		}
		for (k = 0;k < 9;k++)
		{
				for (l = 0;l < 9;l++)
				{
					System.out.print(a[k][l]);
					if (l != 8)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
		}
		return 0;
	}
}

