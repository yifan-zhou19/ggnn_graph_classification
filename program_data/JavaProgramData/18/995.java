package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int min;
		int max;
		int sum;
		int m;
		int[][] a = new int[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = n;
			sum = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					*(*(a + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (m = n;m > 1;m--)
			{
				for (j = 0;j < m;j++)
				{
					for (k = 0;k < m;k++)
					{
						if (k == 0)
						{
							min = (*(a + j) + k);
						}
						else if (min > *(*(a + j) + k))
						{
							min = (*(a + j) + k);
						}
					}
					for (k = 0;k < m;k++)
					{
						*(*(a + j) + k) -= min;
					}
				}
				for (j = 0;j < m;j++)
				{
					for (k = 0;k < m;k++)
					{
						if (k == 0)
						{
							min = (*(a + k) + j);
						}
						else if (min > *(*(a + k) + j))
						{
							min = (*(a + k) + j);
						}
					}
					for (k = 0;k < m;k++)
					{
						*(*(a + k) + j) -= min;
					}
				}
				sum += *(*(a + 1) + 1);
				for (j = 2;j < m;j++)
				{
					*(a + j - 1) = *(a + j);
				}
				for (j = 2;j < m;j++)
				{
					*(*(a + j - 1)) = *(*(a + j));
				}
				for (j = 2;j < m;j++)
				{
					for (k = 2;k < m;k++)
					{
						*(*(a + j - 1) + k - 1) = *(*(a + j) + k);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

