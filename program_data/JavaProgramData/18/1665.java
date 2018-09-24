package <missing>;

public class GlobalMembers
{
	//????????? ??? 20130112

	public static int n;
	public static int[][] A = new int[111][111];

	public static void sum()
	{
		for (int i = 0;i < n;i++)
		{
		for (int j = 0;j < n;j++)
		{
			A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}

		int S = 0;
		for (int t = n;t > 1;t--)
		{
			for (int i = 0;i < t;i++)
			{
				int min = 999999;
				for (int j = 0;j < t;j++)
				{
					if (A[i][j] < min)
					{
						min = A[i][j];
					}
				}
				for (int j = 0;j < t;j++)
				{
					A[i][j] -= min;
				}
			}

			for (int i = 0;i < t;i++)
			{
				int min = 999999;
				for (int j = 0;j < t;j++)
				{
					if (A[j][i] < min)
					{
						min = A[j][i];
					}
				}
				for (int j = 0;j < t;j++)
				{
					A[j][i] -= min;
				}
			}

				S += A[1][1];

				for (int i = 1;i < t;i++)
				{
				for (int j = 0;j < t;j++)
				{
					A[i][j] = A[i + 1][j];
				}
				}

				for (int i = 1;i < t;i++)
				{
				for (int j = 0;j < t;j++)
				{
					A[j][i] = A[j][i + 1];
				}
				}
		}
		System.out.print(S);
		System.out.print("\n");
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			sum();
		}
	}

}

