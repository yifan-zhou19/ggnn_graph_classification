package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int min;

	public static void XJ(int[][] a, int n)
	{
		int[][] b = new int[100][100];
		b[0][0] = a[0][0];
		for (i = 1;i < n - 1;i++)
		{
			b[0][i] = a[0][i + 1];
			b[i][0] = a[i + 1][0];
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				b[i][j] = a[i + 1][j + 1];
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}

	public static int MIN(int[][] a, int n, int sum)
	{
		if (n == 1)
		{
			 return sum;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				int min = a[i][0];
				for (j = 0;j < n;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[i][j] -= min;
				}
			}
			for (i = 0;i < n;i++)
			{
				int min = a[0][i];
				for (j = 0;j < n;j++)
				{
					if (a[j][i] < min)
					{
						min = a[j][i];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[j][i] -= min;
				}
			}
			sum += a[1][1];
			XJ(a, n);
			return MIN(a, n - 1, sum);
		}
	//	return sum;
	}

	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ii;
		int jj;
		for (ii = 0;ii < n;ii++)
		{
			//sum=0;
			for (jj = 0;jj < n;jj++)
			{
				for (k = 0;k < n;k++)
				{
					a[jj][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(MIN(a, n, 0));
			System.out.print("\n");
		}
		return 0;
	}



}

