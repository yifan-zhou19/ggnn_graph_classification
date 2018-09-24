package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int sum = 0;
	public static void guiling(int n)
	{
		int i;
		int j;
		int min;
		for (i = 0; i < n; i++)
		{
			min = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (j = 0; j < n; j++)
		{
			min = a[0][j];
			for (i = 0; i < n; i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (min != 0)
			{
				for (i = 0; i < n; i++)
				{
					a[i][j] -= min;
				}
			}
		}
	}
	public static void xiaojian(int n)
	{
		int i;
		int j;
		sum += a[1][1];
		for (i = 2; i < n; i++)
		{
			a[i - 1][0] = a[i][0];
		}
		for (j = 2; j < n; j++)
		{
			a[0][j - 1] = a[0][j];
		}
		for (i = 2; i < n; i++)
		{
			for (j = 2; j < n; j++)
			{
				a[i - 1][j - 1] = a[i][j];
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			m = n;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (m > 2)
		{
			guiling(m);
			xiaojian(m);
			m--;
		}
		guiling(2);
		sum += a[1][1];
		System.out.print(sum);
		System.out.print("\n");
		sum = 0;
		}
		return 0;
	}


}

