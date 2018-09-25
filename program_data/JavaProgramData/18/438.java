package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int sum;
	public static void f(int m)
	{
		int i;
		int j;
		int min;
		if (m > 1)
		{
			for (i = 0;i < m;i++)
			{
				min = a[i][0];
				for (j = 0;j < m;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				if (min != 0)
				{
					for (j = 0;j < m;j++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
			}
			for (j = 0;j < m;j++)
			{
				min = a[0][j];
				for (i = 0;i < m;i++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				if (min != 0)
				{
					for (i = 0;i < m;i++)
					{
						a[i][j] = a[i][j] - min;
					}
				}
			}
			sum = sum + a[1][1];
			for (j = 2;j < m;j++)
			{
				a[0][j - 1] = a[0][j];
			}
			for (i = 2;i < m;i++)
			{
				a[i - 1][0] = a[i][0];
			}
			for (i = 2;i < m;i++)
			{
				for (j = 2;j < m;j++)
				{
					a[i - 1][j - 1] = a[i][j];
				}
			}
			f(m - 1);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f(n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}




}

