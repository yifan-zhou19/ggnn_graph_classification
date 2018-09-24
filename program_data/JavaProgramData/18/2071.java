package <missing>;

public class GlobalMembers
{
	public static void minus(int[][] a, int n)
	{
		int i;
		int j;
		for (i = j = 0;i < n;i++)
		{
			int m = 10000;
			for (j = 0;j < n;j++)
			{
				m = (m < a[i][j])?m:a[i][j];
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] -= m;
			}
		}
		for (i = j = 0;i < n;i++)
		{
			int m = 10000;
			for (j = 0;j < n;j++)
			{
				m = (m < a[j][i])?m:a[j][i];
			}
			for (j = 0;j < n;j++)
			{
				a[j][i] -= m;
			}
		}
	}

	public static void pr(int[][] a, int k)
	{
		int i;
		int j;
		for (i = 0; i < k; i++)
		{
			for (j = 0; j < k; j++)
			{
				System.out.printf("%d%c",a[i][j],(j + 1 == k)?'\n':',');
			}
		}
	}

	public static void lower(int[][] a, int n)
	{
		int i;
		int j;
		for (i = j = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					a[i][j] = a[i][j];
				}
				else if (i == 0 && j > 0)
				{
					a[i][j] = a[i][j + 1];
				}
				else if (i > 0 && j == 0)
				{
					a[i][j] = a[i + 1][j];
				}
				else if (i > 0 && j > 0)
				{
					a[i][j] = a[i + 1][j + 1];
				}
			}
		}
	}

	public static void fff(int n)
	{
		int[][] a = new int[100][100];
		int i = 0;
		int j;
		int sum;

		for (i = j = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
	   for (i = 0,sum = 0;i < n;i++)
	   {
			minus(a, n - i);
			sum += a[1][1];
			lower(a, n - i);
	   }
	   System.out.printf("%d\n",sum);
	}

	public static void Main()
	{
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i++<n)
		{
			fff(n);
		}
	}
}

