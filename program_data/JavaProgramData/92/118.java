package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return (a > b != 0?a:b);
	}
	public static int cmp(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int g(int i, int j, int[] general, int[] king)
	{
		if (general[i - 1] > king[j - 1])
		{
			return 200;
		}
		else if (general[i - 1] < king[j - 1])
		{
			return -200;
		}
		else
		{
			return 0;
		}
	}

	public static int[][] f = new int[2000][2000];
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			int i;
			int j;
			int[] king = new int[1002]; //??
			int[] general = new int[1002]; //??
			for (i = 0;i < n;i++)
			{
				general[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				king[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(general,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(king,n,(Integer.SIZE / Byte.SIZE),cmp);

	/*??????*/
			for (i = 0;i <= n;i++)
			{
				f[0][i] = 0;
			}
			for (i = 1;i <= n;i++)
			{
				f[i][0] = f[i - 1][0] + g(n + 1 - i, i, general, king);
			}
	//DP
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= i;j++)
				{
					if (i == j)
					{
						f[i][j] = f[i - 1][j - 1] + g(j, i, general, king);
					}
					else
					{
						f[i][j] = max(f[i - 1][j] + g(n - (i - j) + 1, i, general, king), f[i - 1][j - 1] + g(j, i, general, king));
					}
				}
			}
			int temp = -200000000;
			for (i = 0;i <= n;i++)
			{
				temp = max(temp, f[n][i]);
			}

			System.out.print(temp);
			System.out.print("\n");
		}
		return 0;
	}



}

