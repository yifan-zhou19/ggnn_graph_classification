package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[][] a = new int[110][110];
		 int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int k = 0;
		for (k = 0;k < n;k++)
		{
			sum = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			int mi = 9999999;
		for (j = 0;j < n - i;j++)
		{
		mi = 9999999;
		for (int m = 0;m < n - i;m++)
		{
			if (a[j][m] < mi)
			{
				mi = a[j][m];
			}
		}
		for (int m = 0;m < n - i;m++)
		{
			a[j][m] -= mi;
		}
		}
		for (j = 0;j < n - i;j++)
		{
		mi = 9999999;
		for (int m = 0;m < n - i;m++)
		{
			if (a[m][j] < mi)
			{
				mi = a[m][j];
			}
		}
		for (int m = 0;m < n - i;m++)
		{
			a[m][j] -= mi;
		}
		}
		sum += a[1][1];
		for (j = 1;j < n - i - 1;j++)
		{
			a[0][j] = a[0][j + 1];
		}
		for (j = 1;j < n - i - 1;j++)
		{
		 a[j][0] = a[j + 1][0];
		 for (int m = 1;m < n - i - 1;m++)
		 {
			 a[j][m] = a[j + 1][m + 1];
		 }
		}
		}
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;
	}
}

