package <missing>;

public class GlobalMembers
{
	//????????????????????
	//+
	//????win????


	public static int[][] win = new int[1001][1001]; //win[i][j]??i?????j???????????

	public static int Play(int x,int y)
	{
		if (x > y)
		{
			return 1;
		}
		if (x < y)
		{
			return -1;
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int[] qw = new int[1000];
		int[] tj = new int[1000];
		int i;
		int j;

		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;++i)
			{
				tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;++i)
			{
				qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tj,tj + n);
			sort(qw,qw + n);

			win[0][0] = 0;
			for (i = 1;i <= n;++i)
			{
				win[i][0] = win[i - 1][0] + Play(tj[i - 1], qw[n - i]); //?????
				for (j = 1;j < i;++j)
				{
					win[i][j] = win[i - 1][j] + Play(tj[i - j - 1], qw[n - i]); //i?????j?????i????i-j-1???
					if (win[i][j] < win[i - 1][j - 1] + Play(tj[n - j], qw[n - i]))
					{
						win[i][j] = win[i - 1][j - 1] + Play(tj[n - j], qw[n - i]); //i?????j?????i????j???
					}
				}
				win[i][i] = win[i - 1][i - 1] + Play(tj[n - i], qw[n - i]); //?????
			}

			j = 0;
			for (i = 1;i <= n;++i)
			{
				if (win[n][i] > win[n][j])
				{
					j = i;
				}
			}

			System.out.print(win[n][j] * 200);
			System.out.print("\n");
		}

		return 0;
	}
}

