package <missing>;

public class GlobalMembers
{
	public static void rezero()
	{
		int i;
		int j;
		int k;
		int min;
		for (k = 0; k < n - 1; k++)
		{
			for (i = 0; i < b; i++)
			{
				min = a[i][0];
				for (j = 0; j < b; j++)
				{
					if (a[i][j] <= min)
					{
						min = a[i][j];
					}
				}
				for (j = 0; j < b; j++)
				{
					a[i][j] -= min;
				}
			}
		for (i = 0; i < b; i++)
		{
			min = a[0][i];
			for (j = 0; j < b; j++)
			{
				if (a[j][i] <= min)
				{
					min = a[j][i];
				}
			}
			for (j = 0; j < b; j++)
			{
				a[j][i] -= min;
			}
		}
		dele();
		b -= 1;
		}
	}
	public static void dele()
	{
		int i;
		int j;
		sum += a[1][1];
		for (i = 0; i < b; i++)
		{
			for (j = 1; j < b - 1; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0; j < b - 1; j++)
		{
			for (i = 1; i < b - 1; i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static int[][] a = new int[100][100];
	public static int n;
	public static int b;
	public static int sum = 0;
	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			b = n;
			rezero();
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

