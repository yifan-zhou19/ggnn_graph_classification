package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] mian = new int[105][105];
		int i;
		int j;
		int i1;
		int j1;
		int i2;
		int j2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				mian[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (mian[i][j] == 0 && mian[i + 1][j] == 0 && mian[i][j + 1] == 0)
				{
					i1 = i;
					j1 = j;
				}
				else if (mian[i][j] == 0 && mian[i - 1][j] == 0 && mian[i][j - 1] == 0)
				{
					i2 = i;
					j2 = j;
				}
			}
		}
		System.out.print((i2 - i1 - 1) * (j2 - j1 - 1));
		return 0;
	}
}

