package <missing>;

public class GlobalMembers
{
	public static void make_zero(int[][] a, int p)
	{
		int flag = 0;
		int m;
		for (int i = 0; i <= p; i++)
		{
			m = min(a, i, p, flag);
			for (int j = 0; j <= p; j++)
			{
				a[i][j] -= m;
			}
		}
		flag = 1;
		for (int k = 0; k <= p; k++)
		{
			m = min(a, k, p, flag);
			for (int j = 0; j <= p; j++)
			{
				a[j][k] -= m;
			}
		}
	}
	public static void reduce(int[][] a, int p)
	{
		for (int i = 0; i <= p; i++)
		{
			for (int j = 1; j < p; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (int k = 0; k < p; k++)
		{
			for (int j = 1; j < p; j++)
			{
				a[j][k] = a[j + 1][k];
			}
		}
	}
	public static int min(int[][] a, int i, int p, int flag)
	{
		int t;
		if (flag == 0)
		{
			t = a[i][0];
			for (int j = 0; j <= p; j++)
			{
				if (a[i][j] < t)
				{
					t = a[i][j];
				}
			}
		}
		else
		{
			t = a[0][i];
			for (int j = 0; j <= p; j++)
			{
				if (a[j][i] < t)
				{
					t = a[j][i];
				}
			}
		}
		return t;
	}

	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			sum = 0;
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int p = n - 1; p > 0; p--)
			{
				make_zero(a, p);
				sum += a[1][1];
				reduce(a, p);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

