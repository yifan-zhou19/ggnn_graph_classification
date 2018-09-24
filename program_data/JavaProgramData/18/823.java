package <missing>;

public class GlobalMembers
{
	public static int f(int a, int b)
	{
		if (a >= b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int sum;
		int x;
		int y;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[][] a = new int[100][100];
			int[][] b = new int[100][100];
			sum = 0;
			for (j = 0;j < n;j++)
			{
				for (t = 0;t < n;t++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][t] = Integer.parseInt(tempVar2);
					}
					b[j][t] = a[j][t];
				}
			}
			for (r = 0;r < n - 1;r++)
			{
				for (j = 0;j < n;j++)
				{
					x = 0;
					for (t = 0;t < n - 1;t++)
					{
						a[j][t + 1] = f(a[j][t], a[j][t + 1]);
					}
					x = a[j][t];
					for (t = 0;t < n;t++)
					{
						b[j][t] = b[j][t] - x;
						a[j][t] = b[j][t];
					}
				}
				for (j = 0;j < n;j++)
				{
					y = 0;
					for (t = 0;t < n - 1;t++)
					{
						a[t + 1][j] = f(a[t][j], a[t + 1][j]);
					}
					y = a[t][j];
					for (t = 0;t < n;t++)
					{
					b[t][j] = b[t][j] - y;
					a[t][j] = b[t][j];
					}
				}
				sum = sum + a[1][1];
				for (j = 0;j < n;j++)
				{
					for (t = 1;t < n - 1;t++)
					{
					   a[t][j] = a[t + 1][j];
					   b[t][j] = a[t][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					for (t = 1;t < n - 1;t++)
					{
					   a[j][t] = a[j][t + 1];
					   b[j][t] = a[j][t];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

