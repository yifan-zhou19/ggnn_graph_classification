package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int[][] f = new int[101][101];
		int i;
		int j;
		for (i = 1;i < 101;++i)
		{
			f[i][0] = 0,f[0][i] = 1;
		}
		for (i = 1;i < 101;++i)
		{
			for (j = 1;j < 101;++j)
			{
				if (i < j)
				{
					f[i][j] = f[i][j - 1];
				}
				else
				{
					f[i][j] = f[i - j][j] + f[i][j - 1];
				}
			}
		}
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f[m][n]);
			System.out.print("\n");
		}
	}

}

