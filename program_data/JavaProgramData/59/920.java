package <missing>;

public class GlobalMembers
{
	//???? ??? 20121130

	public static char[][][] B = new char[102][102][102];
	public static int n;
	public static int m;

	public static void ini() //???
	{
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
			B[i][j][0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		}

	}

	public static void inf(int i,int j,int t) //??
	{
		if (B[i][j][t] == '@')
		{
			if (B[i + 1][j][t] == '.')
			{
				B[i + 1][j][t + 1] = '@';
			}
			if (B[i - 1][j][t] == '.')
			{
				B[i - 1][j][t + 1] = '@';
			}
			if (B[i][j + 1][t] == '.')
			{
				B[i][j + 1][t + 1] = '@';
			}
			if (B[i][j - 1][t] == '.')
			{
				B[i][j - 1][t + 1] = '@';
			}
		}
	}

	public static void ill(int t)
	{
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
			B[i][j][t + 1] = B[i][j][t];
		}
		}
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
			inf(i, j, t);
		}
		}
		if (t != m)
		{
			ill(t + 1);
		}
	}

	public static int stat(int t)
	{
		int Amount = 0;
		for (int i = 1;i <= n;i++)
		{
		for (int j = 1;j <= n;j++)
		{
		if (B[i][j][t] == '@')
		{
			Amount++;
		}
		}
		}
		return Amount;
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ini();
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ill(0);
		System.out.print(stat(m - 1));
		return 0;
	}

}

