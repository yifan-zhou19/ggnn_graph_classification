package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105]; //??????????
	public static int f(int n)
	{
		int i;
		int j;
		int r = 0; //?????????
		int l = 0;
		if (n == 1)
		{
				 return 0; //?n = 1???0
		}
		else
		{ //??
			for (i = 0;i < n;i++)
			{ //??????
			r = a[i][0];
			for (j = 1;j < n;j++)
			{
				if (r > a[i][j])
				{
					r = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - r;
			}
			}
		for (j = 0;j < n;j++)
		{ //??????
			l = a[0][j];
			for (i = 1;i < n;i++)
			{
				if (l > a[i][j])
				{
					l = a[i][j];
				}
			}
			for (i = 0;i < n;i++)
			{
				a[i][j] = a[i][j] - l;
			}
		}
		int m;
		m = a[1][1]; //??a[1][1]
		for (i = 0;i < n;i++) //?????????
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 1;i < n - 1;i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		return m + f(n - 1); //??
		}
	}
	public static int Main()
	{ //?????
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = 0;
			sum = f(n);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

