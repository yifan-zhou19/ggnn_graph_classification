package <missing>;

public class GlobalMembers
{
	//**************************
	//*??????????? **
	//*?????? **
	//*???2012-11-25 **
	//*???1200012957 **
	//**************************

	public static int[][] a = new int[100][100];

	public static int sum(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		int i;
		int j;
		int p;
		int min;
		int a11;
		for (i = 0; i < n; i++)
		{
			p = 0;
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < a[i][p])
				{
					p = j;
				}
			}
			min = a[i][p];
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (i = 0; i < n; i++)
		{
			p = 0;
			for (j = 0; j < n; j++)
			{
				if (a[j][i] < a[p][i])
				{
					p = j;
				}
			}
			min = a[p][i];
			for (j = 0; j < n; j++)
			{
				a[j][i] -= min;
			}
		}
		a11 = a[1][1];
		for (i = 2; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i - 1][j] = a[i][j];
			}
		}
		for (i = 2; i < n; i++)
		{
			for (j = 0; j < n - 1; j++)
			{
				a[j][i - 1] = a[j][i];
			}
		}
		return a11 + sum(n - 1);
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sum(n));
			System.out.print("\n");
		}

		return 0;
	}

}

