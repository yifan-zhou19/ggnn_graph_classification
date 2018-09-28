package <missing>;

public class GlobalMembers
{
	public static int[][] g_arrayA = new int[1024][1024];
	public static int[][] g_arrayB = new int[1024][1024];


	public static int Main()
	{
		int m;
		int n;
		int n1;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; ++i)
		{
			for (int j = 0; j < n; ++j)
			{
				g_arrayA[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n1; ++i)
		{
			for (int j = 0; j < k; ++j)
			{
				g_arrayB[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < m; ++i)
		{
			for (int j = 0; j < k; ++j)
			{
				int result = 0;
				for (int t = 0; t < n; ++t)
				{
					result += g_arrayA[i][t] * g_arrayB[t][j];
				}
				if (j == 0)
				{
					System.out.print(result);
				}
				else
				{
					System.out.print(" ");
					System.out.print(result);
				}
			}
			System.out.print("\n");
		}
	}

}

