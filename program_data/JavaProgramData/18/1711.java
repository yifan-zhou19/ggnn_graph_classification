package <missing>;

public class GlobalMembers
{
	public static void zero(int[][] a, int n)
	{
		int[] min = new int[100];
		for (int i = 0;i < n;++i)
		{
			min[i] = a[i][0];
			for (int j = 0;j < n;++j)
			{
				if (a[i][j] < min[i])
				{
					min[i] = a[i][j];
				}
			}
			if (min[i] != 0)
			{
				for (int j = 0;j < n;++j)
				{
					a[i][j] -= min[i];
				}
			}
		}
		for (int j = 0;j < n;++j)
		{
			min[j] = a[0][j];
			for (int i = 0;i < n;++i)
			{
				if (a[i][j] < min[j])
				{
					min[j] = a[i][j];
				}
			}
			if (min[j] != 0)
			{
				for (int i = 0;i < n;++i)
				{
					a[i][j] -= min[j];
				}
			}
		}
	}
	public static void subduction(int[][] a, int n)
	{
		for (int i = 1;i < n - 1;++i)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (int i = 1;i < n - 1;++i)
		{
			for (int j = 1;j < n - 1;++j)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int s;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0;t < n;++t)
		{
			s = 0,m = n;
			for (int i = 0;i < n;++i)
			{
				for (int j = 0;j < n;++j)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (m != 1)
			{
				zero(a, m);
				s += a[1][1];
				subduction(a, m--);
			}
			System.out.print(s);
			System.out.print("\n");
		}
	}

}

