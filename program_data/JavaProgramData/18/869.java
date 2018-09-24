package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int z;
		int sum;
		int min;
		int[][] a = new int[105][105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int z = 0;z < n;z++)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (k = 0;k < n - 1;k++)
			{
				for (i = 0;i < n - k;i++)
				{
					min = 100000000;
					for (j = 0;j < n - k;j++)
					{
						if (*(*(a + i) + j) < min)
						{
							min = (*(a + i) + j);
						}
					}
					for (j = 0;j < n - k;j++)
					{
						*(*(a + i) + j) -= min;
					}
				}
				for (i = 0;i < n - k;i++)
				{
					min = 100000000;
					for (j = 0;j < n - k;j++)
					{
						if (*(*(a + j) + i) < min)
						{
							min = (*(a + j) + i);
						}
					}
					for (j = 0;j < n - k;j++)
					{
						*(*(a + j) + i) -= min;
					}
				}
				sum += *(*(a + 1) + 1);
				for (i = 0;i < n - k;i++)
				{
					for (j = 2;j < n - k;j++)
					{
						*(*(a + i) + j - 1) = *(*(a + i) + j);
					}
				}
				for (j = 0;j < n - k - 1;j++)
				{
					for (i = 2;i < n - k;i++)
					{
						*(*(a + i - 1) + j) = *(*(a + i) + j);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

