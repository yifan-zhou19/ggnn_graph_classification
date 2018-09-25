package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int j;
		int[][] f = new int[NUM][NUM];
		for (i = 1;i < NUM;++i)
		{
			f[0][i] = 1,f[i][0] = 0;
		}
		for (i = 1;i < NUM;++i)
		{
			for (j = 1;j < NUM;++j)
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

