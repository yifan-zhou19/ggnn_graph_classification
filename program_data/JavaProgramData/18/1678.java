package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];

	public static void function(int n)
	{
		int i;
		int j;
		int k;
		int min;
		int num = 0;
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = n ; i > 1 ; i--)
		{
			for (j = 0 ; j < i ; j++)
			{
				min = a[j][0];
				for (k = 0 ; k < i ; k++)
				{
					if (a[j][k] < min)
					{
					min = a[j][k];
					}
				}
				for (k = 0 ; k < i ; k++)
				{
					a[j][k] = a[j][k] - min;
				}
			}
			for (j = 0 ; j < i ; j++)
			{
				min = a[0][j];
				for (k = 0 ; k < i ; k++)
				{
					if (a[k][j] < min)
					{
					min = a[k][j];
					}
				}
				for (k = 0 ; k < i ; k++)
				{
					a[k][j] = a[k][j] - min;
				}
			}
			num = num + a[1][1];
			for (j = 0 ; j < i ; j++)
			{
				for (k = 0 ; k < i ; k++)
				{
					if (j == 0 && k > 1)
					{
					a[j][k - 1] = a[j][k];
					}
					if (k == 0 && j > 1)
					{
					a[j - 1][k] = a[j][k];
					}
					if (j > 1 && k > 1)
					{
					a[j - 1][k - 1] = a[j][k];
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			function(n);
		}
		return 0;
	}
}

