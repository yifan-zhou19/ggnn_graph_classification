package <missing>;

public class GlobalMembers
{
	public static int[][] bac = new int[11][11];
	public static int[][] tp = new int[11][11];
	public static int n;
	public static int m;
	public static void mul(int x)
	{
		if (x == n)
		{
			return;
		}
		else
		{
			for (int i = 0;i < 11;i++)
			{
				for (int j = 0;j < 11;j++)
				{
					tp[i][j] = 0;
				}
			}
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					tp[i - 1][j] += bac[i][j];
					tp[i + 1][j] += bac[i][j];
					tp[i - 1][j - 1] += bac[i][j];
					tp[i + 1][j - 1] += bac[i][j];
					tp[i - 1][j + 1] += bac[i][j];
					tp[i + 1][j + 1] += bac[i][j];
					tp[i][j - 1] += bac[i][j];
					tp[i][j + 1] += bac[i][j];
					tp[i][j] += 2 * bac[i][j];
				}
			}
			for (int i = 1;i <= 9;i++)
			{
				for (int j = 1;j <= 9;j++)
				{
					bac[i][j] = tp[i][j];
				}
			}
			mul(x + 1);
		}
	}
	public static int Main()
	{
		for (int i = 0;i < 11;i++)
		{
			for (int j = 0;j < 11;j++)
			{
				bac[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bac[5][5] = m;
		mul(0);
		for (int i = 1;i <= 9;i++)
		{
			System.out.print(bac[i][1]);
			for (int j = 2;j <= 9;j++)
			{
				System.out.print(" ");
				System.out.print(bac[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

