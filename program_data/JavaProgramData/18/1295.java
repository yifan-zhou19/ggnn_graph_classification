package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static void minu(int n)
	{
		int i;
		int j;
		int min;
		for (i = 0; i < n; i++)
		{
			min = a[i][0];
			for (j = 1; j < n; j++)
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
		for (i = 0; i < n; i++)
		{
			min = a[0][i];
			for (j = 1; j < n; j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[j][i] -= min;
			}
		}
	}
	public static void shrink(int n)
	{
		int i;
		int j;
		for (i = 1; i < n - 1; i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
			for (j = 1; j < n - 1; j++)
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
		int sum;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sum = 0;
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (x = n; x > 1; x--)
			{
				minu(x);
				sum += a[1][1];
				shrink(x);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

