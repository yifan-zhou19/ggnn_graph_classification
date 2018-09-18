package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[102][102];
	public static int[] b = new int[101];
	public static int[] c = new int[101];
	public static int n;
	public static void f(int[][] a)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		for (k = 1; k < n; k++)
		{
			for (i = 0; i < n; i++)
			{
				if (i >= k != 0 || i == 0)
				{
					b[i] = a[i][0];
					for (j = 1; j < n; j++)
					{
						if (a[i][j] < b[i])
						{
							b[i] = a[i][j];
						}
					}

					for (j = 0; j < n; j++)
					{
						a[i][j] -= b[i];
					}
				}
			}
			for (j = 0; j < n; j++)
			{
				if (j >= k != 0 || j == 0)
				{
					c[j] = a[0][j];
					for (i = 0; i < n; i++)
					{
						if (c[j] > a[i][j])
						{
							c[j] = a[i][j];
						}
					}
					for (i = 0; i < n; i++)
					{
						a[i][j] -= c[j];
					}
				}
			}
			 sum += a[k][k];
			 //cout<<sum<<' '<<k<<' ';
			for (i = 0; i < n; i++)
			{
				a[i][k] = 1000000;
				a[k][i] = 1000000;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			f(a);
		}

	return 0;
	}


}

