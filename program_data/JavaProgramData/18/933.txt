package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] num = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = num;
		for (int k = 0;k < n;k++)
		{
			int sum = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}

			int m = n;
			while (m > 1)
			{
				for (int i = 0;i < m;i++)
				{
					int min = (p[i] + 0);
					for (int j = 0;j < m;j++)
					{
						if (min > *(p[i] + j))
						{
							min = (p[i] + j);
						}
					}
					for (int j = 0;j < m;j++)
					{
						*(p[i] + j) -= min;
					}
				}

				for (int j = 0;j < m;j++)
				{
					int min = (p[0] + j);
					for (int i = 0;i < m;i++)
					{
						if (min > *(p[i] + j))
						{
							min = (p[i] + j);
						}
					}
					for (int i = 0;i < m;i++)
					{
						*(p[i] + j) -= min;
					}
				}
				sum += num[1][1];
				for (int i = 1;i < m - 1;i++)
				{
					*(p[i] + 0) = *(p[i + 1] + 0);
				}
				for (int j = 1;j < m - 1;j++)
				{
					*(p[0] + j) = *(p[0] + j + 1);
				}
				for (int i = 2;i < m;i++)
				{
					for (int j = 2;j < m;j++)
					{
						*(p[i - 1] + j - 1) = *(p[i] + j);
					}
				}
				m--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

