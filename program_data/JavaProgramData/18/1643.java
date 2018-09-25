package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] m = new int[105][105];
		int s;
		int min = 10000;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = n;
		for (int g = 1;g <= n;g++)
		{
			sum = 0;
			s = n;
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int k = 1;k <= n - 1;k++)
			{
				for (int i = 1;i <= s;i++)
				{
					min = 10000;
					for (int j = 1;j <= s;j++)
					{
						if (m[i][j] < min)
						{
							min = m[i][j];
						}
					}
					for (int j = 1;j <= s;j++)
					{
						m[i][j] = m[i][j] - min;
					}
				}
				for (int i = 1;i <= s;i++)
				{
					min = 10000;
					for (int j = 1;j <= s;j++)
					{
						if (m[j][i] < min)
						{
							min = m[j][i];
						}
					}
					for (int j = 1;j <= s;j++)
					{
						m[j][i] = m[j][i] - min;
					}
				}
				sum = sum + m[2][2];
				for (int i = 2;i <= s - 1;i++)
				{
					for (int j = 1;j <= s;j++)
					{
						m[i][j] = m[i + 1][j];
					}
				}
				for (int i = 2;i <= s - 1;i++)
				{
					for (int j = 1;j <= s - 1;j++)
					{
						m[j][i] = m[j][i + 1];
					}
				}
				s = s - 1;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

