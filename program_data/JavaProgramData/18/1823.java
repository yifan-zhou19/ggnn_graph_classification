package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int[][] a = new int[100][100];
	public static int sum = 0;

	public static void d(int n)
	{
		int min;

		for (int i = 0;i < n;i++)
		{
			min = a[i][0];
			for (int j = 0;j < n;j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
				}
			}
			for (int j = 0;j < n;j++)
			{
				a[i][j] -= min;
			}
		}
		for (int j = 0;j < n;j++)
		{
			min = a[0][j];
			for (int i = 0;i < n;i++)
			{
				if (min > a[i][j])
				{
								min = a[i][j];
				}
			}
			for (int i = 0;i < n;i++)
			{
				a[i][j] -= min;
			}
		}
		sum += a[1][1];
		for (int i = 0;i < n;i++)
		{
			for (int j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (int j = 0;j < n - 1;j++)
		{
			for (int i = 1;i < n - 1;i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		if (n > 2)
		{
			d(n - 1);
		}


	}
	public static int Main()
	{

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] s = new int[m + 1];
		int p = 1;
		for (int t = 1;t <= m;t++)
		{
			for (int i = 0;i < m;i++)
			{
			  for (int j = 0;j < m;j++)
			  {
				  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			}
			d(m);
			s[p++] = sum;
			sum = 0;

		}
		for (int i = 1;i <= m;i++)
		{
			System.out.print(s[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

