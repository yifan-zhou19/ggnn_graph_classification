package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int[][] a = new int[101][101];
	public static int sum = 0;
	public static int k = 0;
	public static void zerorow(int k)
	{
		int min = 0;
		for (int i = 0; i < k; i++) //every row
		{
			min = a[i][0];
			for (int j = 1; j < k; j++) //find min
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (min != 0)
			{
				for (int j = 0; j < k; j++) //to zero
				{
					a[i][j] -= min;
				}
			}
		}
	}
	public static void zerocol(int k)
	{
		int min = 0;
		for (int i = 0; i < k; i++) //every col
		{
			min = a[0][i];
			for (int j = 1; j < k; j++) //find min
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			if (min != 0)
			{
				for (int j = 0; j < k; j++) //to zero
				{
					a[j][i] -= min;
				}
			}
		}
	}
	public static void jian(int k)
	{
		for (int i = 2; i < k; i++) //row move up
		{
			for (int j = 0; j < k; j++)
			{
				a[i - 1][j] = a[i][j];
			}
		}
		for (int j = 2; j < n; j++) //col move left
		{
			for (int i = 0; i < k - 1; i++)
			{
				a[i][j - 1] = a[i][j];
			}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a[0][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum = 0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (i + j != 0)
					{
						a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
				}
			}
			for (k = n; k > 1; k--)
			{
				zerorow(k);
				zerocol(k);
				sum += a[1][1];
				jian(k);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

