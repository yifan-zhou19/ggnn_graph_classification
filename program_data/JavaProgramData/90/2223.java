package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int t;
		int[][] opt = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(opt, 0, (Integer.SIZE / Byte.SIZE));
		for (int i = 0; i < 101; ++i)
		{
			opt[0][i] = 1;
		}
		for (int i = 0; i < 101; ++i)
		{
			opt[i][1] = 1;
		}
		for (int j = 1; j < 101; ++j)
		{
			opt[1][j] = 1;
		}
		for (int j = 2; j < 101; ++j)
		{
			for (int i = 2; i < 101; ++i)
			{
				if (i >= j)
				{
					opt[i][j] += opt[i - j][j];
				}
				opt[i][j] += opt[i][j - 1];
			}
		}
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(opt[m][n]);
			System.out.print("\n");
		}
		return 0;
	}
}

