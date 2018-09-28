package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][][] a = new char[2][102][102];
		int i;
		int n;
		int j;
		int t;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[0][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
				{
					a[0][i][j] = '#';
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 1;
		while (t < m)
		{

			for (i = n;i >= 1;i--)
			{
				for (j = n;j >= 1;j--)
				{
					if (a[(t + 1) % 2][i][j] != '#' && (a[(t + 1) % 2][i - 1][j] == '@' || a[(t + 1) % 2][i][j - 1] == '@' || a[(t + 1) % 2][i][j + 1] == '@' || a[(t + 1) % 2][i + 1][j] == '@'))
					{
						a[t % 2][i][j] = '@';
					}
					else
					{
						a[t % 2][i][j] = a[(t + 1) % 2][i][j];
					}
				}
			}
			t++;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[(m - 1) % 2][i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}

}

