package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105];
	public static int guiling(int n)
	{
		for (int i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (int j = 1; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (int i = 0; i < n; i++)
		{
			int min = a[0][i];
			for (int j = 1; j < n; j++)
			{
				if (a[j][i] < min)
				{
				min = a[j][i];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[j][i] -= min;
			}
		}
		int k = a[1][1];
		if (n == 2)
		{
			return k;
		}
		else
		{
			xiaojian(n);
			return k + guiling(n - 1);
		}
	}
	public static void xiaojian(int n)
	{
		for (int i = 1; i < n - 1; i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
			for (int j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				System.out.print(guiling(n));
				System.out.print("\n");
		}

		return 0;
	}
}

