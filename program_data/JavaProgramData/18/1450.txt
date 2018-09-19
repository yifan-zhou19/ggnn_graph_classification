package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static int[][] a = new int[100][100];
	public static void hang(int n)
	{
		for (int i = 0;i < n;i++)
		{
			int min = a[i][0];
			for (int j = 0;j < n;j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
				}
			}
			for (int j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - min;
			}
			min = 0;
		}
	}
	public static void lie(int n)
	{
		for (int i = 0;i < n;i++)
		{
			int min = a[0][i];
			for (int j = 0;j < n;j++)
			{
				if (min >= a[j][i])
				{
					min = a[j][i];
				}
			}
			for (int j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - min;
			}
			min = 0;
		}
	}
	public static void xiaoqu(int n)
	{
		for (int i = 1;i < n - 1;i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
		}
		for (int i = 1;i < n - 1;i++)
		{
			for (int j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
	}
	public static void sum(int n)
	{
		if (n > 1)
		{
			hang(n);
			lie(n);
			s += a[1][1];
			xiaoqu(n);
			sum(n - 1);
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = n;
		while (k != 0)
		{
			k--;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum(n);
			System.out.print(s);
			System.out.print("\n");
			s = 0;
		}
		return 0;
	}

}

