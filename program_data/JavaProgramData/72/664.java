package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[21][21];
		int[][] sign = new int[21][21];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				int k = 0;
				int sum = 0;
				if (i - 1 >= 0)
				{
					k++;
					if (a[i][j] >= a[i - 1][j])
					{
						sum++;
					}
				}
				if (i + 1 < m)
				{
					k++;
					if (a[i][j] >= a[i + 1][j])
					{
						sum++;
					}

				}
				if (j - 1 >= 0)
				{
					k++;
					if (a[i][j] >= a[i][j - 1])
					{
						sum++;
					}

				}
				if (j + 1 < n)
				{
					k++;
					if (a[i][j] >= a[i][j + 1])
					{
						sum++;
					}

				}

				if (sum == k)
				{
					sign[i][j] = 1;
				}

			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sign[i][j] == 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
			return 0;
	}
}

