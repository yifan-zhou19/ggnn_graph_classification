package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.
	 *  ????: 2010-12-31
	 *    ??????
	 */
	public static int[][] juzhen = new int[101][101];
	public static int sum;
	public static void xiaochu(int n)
	{
		if (n == 1)
		{
			;
		}
		else
		{
			int[] minj = new int[101];
			for (int i = 0; i < n; i++)
			{
				minj[i] = 1000;
			}
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (juzhen[i][j] < minj[i])
					{
						minj[i] = juzhen[i][j];
					}
				}
				for (int j = 0; j < n; j++)
				{
					juzhen[i][j] = juzhen[i][j] - minj[i];
				}
			}
			for (int i = 0; i < n; i++)
			{
				minj[i] = 1000;
			}
			for (int j = 0; j < n; j++)
			{
				for (int i = 0; i < n; i++)
				{
					if (juzhen[i][j] < minj[j])
					{
						minj[j] = juzhen[i][j];
					}
				}
				for (int i = 0; i < n; i++)
				{
					juzhen[i][j] = juzhen[i][j] - minj[j];
				}
			}
			sum = sum + juzhen[1][1];
			for (int j = 1; j < n - 1; j++)
			{
				juzhen[0][j] = juzhen[0][j + 1];
				juzhen[j][0] = juzhen[j + 1][0];
			}
			for (int i = 1; i < n - 1; i++)
			{
				for (int j = 1; j < n - 1; j++)
				{
					juzhen[i][j] = juzhen[i + 1][j + 1];
				}
			}
			xiaochu(n - 1);
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0; z < n; z++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			xiaochu(n);
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

