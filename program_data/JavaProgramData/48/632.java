package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??????????                     **
	//*?????? 1100012920              **
	//*???2011.11.28                    **
	//****************************************
	public static int[][] num = new int[11][11];
	public static int f(int i, int j, int n)
	{
		if (i == 0 || i == 10 || j == 0 || j == 10)
		{
			return 0;
		}

		else if (n == 0)
		{
			return num[i][j];
		}
		else
		{
			return f(i, j, n - 1) * 2 + f(i + 1, j, n - 1) + f(i - 1, j, n - 1) + f(i, j + 1, n - 1) + f(i, j - 1, n - 1) + f(i + 1, j + 1, n - 1) + f(i + 1, j - 1, n - 1) + f(i - 1, j + 1, n - 1) + f(i - 1, j - 1, n - 1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[5][5] = m;
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j < 9; j++)
				{
					k = f(i, j, n);
					System.out.print(k);
					System.out.print(" ");
				}
				System.out.print(f(i, 9, n));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

