package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int sum;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			int f = new int(int a[100][100],int n);
			sum = f(a, n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int[][] a, int n)
	{
		if (n == 1)
		{
			return 0;
		}
		int i;
		int j;
		int k;
		int min;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			min = a[i][0];
			for (j = 0;j < n;j++)
			{
				if (a[i][j] <= min)
				{
				min = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (j = 0;j < n;j++)
		{
			min = a[0][j];
			for (i = 0;i < n;i++)
			{
				if (a[i][j] <= min)
				{
				min = a[i][j];
				}
			}
			for (i = 0;i < n;i++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		k = a[1][1];
		for (i = 2;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			a[i - 1][j] = a[i][j];
			}
		}
		for (j = 2;j < n;j++)
		{
			for (i = 0;i < (n - 1);i++)
			{
			a[i][j - 1] = a[i][j];
			}
		}
		n = n - 1;
		sum = k + f(a, n);
		return (sum);
	}


}

