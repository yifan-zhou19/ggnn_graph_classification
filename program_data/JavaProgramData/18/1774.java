package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] num = new int[n][n];
		int sum = 0;
		int min = 0;
		for (int k = 0; k < n; k++) // N?
		{
			sum = 0;
			for (int i = 0; i < n; i++) // ??
			{
				for (int j = 0; j < n; j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int s = 0; s < n - 1; s++)
			{
				for (int i = 0; i < n; i++) // ????
				{
					min = INT_MAX;
					for (int j = 0; j < n; j++)
					{
						if (num[i][j] >= 0 && num[i][j] < min)
						{
						min = num[i][j];
						}
					}
					for (int j = 0; j < n; j++) // ????
					{
						num[i][j] -= min;
					}
				}
				for (int j = 0; j < n; j++) // ????
				{
					min = INT_MAX;
					for (int i = 0; i < n; i++)
					{
						if (num[i][j] >= 0 && num[i][j] < min)
						{
						min = num[i][j];
						}
					}
					for (int i = 0; i < n; i++) // ???
					{
						num[i][j] -= min;
					}
				}
				sum += num[1 + s][1 + s]; // ?????????
				for (int i = 0; i < n; i++) // ??? ??-1?
				{
					num[1 + s][i] = -1;
					num[i][1 + s] = -1;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

