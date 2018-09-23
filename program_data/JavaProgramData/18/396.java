package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int[][] a = new int[105][105];
		while ((a[0][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0; i < n; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					if (i == 0 && j == 0)
					{
						continue;
					}
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			int tmp = n;
			int sum = 0;
			while (--tmp != 0)
			{
				int tmp_min;
				//???
				for (i = 0; i < tmp + 1; ++i)
				{
					tmp_min = 600000;
					for (j = 0; j < tmp + 1; ++j)
					{
						if (tmp_min > a[i][j])
						{
							tmp_min = a[i][j];
						}
					}
					if (tmp_min != 0)
					{
						for (j = 0; j < tmp + 1; ++j)
						{
							a[i][j] -= tmp_min;
						}
					}
				}
				//???
				for (j = 0; j < tmp + 1; ++j)
				{
					tmp_min = 600000;
					for (i = 0; i < tmp + 1; ++i)
					{
						if (tmp_min > a[i][j])
						{
							tmp_min = a[i][j];
						}
					}
					if (tmp_min != 0)
					{
						for (i = 0; i < tmp + 1; ++i)
						{
							a[i][j] -= tmp_min;
						}
					}
				}
				sum += a[1][1];
				//???n-1
				for (i = 2; i < tmp + 1; ++i)
				{
					a[0][i - 1] = a[0][i];
					a[i - 1][0] = a[i][0];
				}
				for (i = 2; i < tmp + 1; ++i)
				{
					for (j = 2; j < tmp + 1; ++j)
					{
						a[i - 1][j - 1] = a[i][j];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

