package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void down1(int[][] a, int m)
	{
		int i;
		int p;
		int j;
		for (i = m;i < n;i = i + 1)
		{
			p = a[i][m];
			for (j = m + 1;j < n;j = j + 1)
			{
				if (p > a[i][j])
				{
					p = a[i][j];
				}
			}
			for (j = m;j < n;j = j + 1)
			{
				a[i][j] = a[i][j] - p;
			}
		}
	}
	public static void down2(int[][] a, int m)
	{
		int i;
		int j;
		int p;
		for (i = m;i < n;i = i + 1)
		{
			p = a[m][i];
			for (j = m + 1;j < n;j = j + 1)
			{
				if (p > a[j][i])
				{
					p = a[j][i];
				}
			}
			for (j = m;j < n;j = j + 1)
			{
				a[j][i] = a[j][i] - p;
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		while (k < n)
		{
			k = k + 1;
		t = 0;
		for (i = 0;i < n;i = i + 1)
		{
			for (j = 0;j < n;j = j + 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n - 1;i = i + 1)
		{
			down1(a, i - 1);
			down2(a, i - 1);
			t = t + a[i][i];
			for (j = i - 1;j < n;j = j + 1)
			{
				a[i][j] = a[i - 1][j];
			}
			for (j = i;j < n;j = j + 1)
			{
				a[j][i] = a[j][i - 1];
			}
		}
		System.out.printf("%d",t);
		if (k < n)
		{
			System.out.print("\n");
		}
		}
		return 0;
	}

}

