package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int[][] a = new int[101][101];
	public static void guiling(int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (j = 1; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (i = 0; i < n; i++)
		{
			int min = a[0][i];
			for (j = 1; j < n; j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[j][i] = a[j][i] - min;
			}
		}
	}
	public static void xiaojian(int n)
	{
		int i;
		int j;
		for (i = 1; i < n - 1; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (i = 1; i < n - 1; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
	}
	public static void f(int n)
	{
		if (n == 1)
		{
			return;
		}
		else
		{
			guiling(n);
			sum += a[1][1];
			xiaojian(n);
			f(n - 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			sum = 0;
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f(n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

