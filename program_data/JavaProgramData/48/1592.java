package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static int k;
	public static int i;
	public static int j;
	public static int t;
	public static int s;
	public static int m;
	public static int n;
	public static int p;
	public static int q;
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 0;k < n;k++)
		{
			t = n % 2,s = 1 - t;
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					b[i][j] = 0;
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					b[i][j] += a[i][j];
					for (p = -1;p <= 1;p++)
					{
						for (q = -1;q <= 1;q++)
						{
							b[i][j] += a[i + p][j + q];
						}
					}
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			System.out.print(a[i][1]);
			for (j = 2;j < 10;j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}

}

