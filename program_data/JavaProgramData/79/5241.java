package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[MAX];
		int i;
		int j;
		int[][] b = new int[MAX][MAX];
		int t;
		int p;
		n = -1;
		m = -1;
		while (n != 0 && m != 0)
		{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n != 0 && m != 0)
		{
		t = n;
		for (i = 0; i < n; i++)
		{
			a[i] = i + 1;
		}

		int k = 0;
		for (i = 0; i < n; i++)
		{
			if (k == 0)
			{
				for (j = 0; j < m; j++)
				{
				if (k != t - 1)
				{
					b[i][j] = a[k];
					k++;
				}
				else
				{
					b[i][j] = a[k];
					k = k - t + 1;
				}
				}
			}
			else
			{
				k--;
				for (j = 0; j < m; j++)
				{
					if (k != t - 1)
					{
						b[i][j] = a[k];
						k++;
					}
					else
					{
						b[i][j] = a[k];
						k = k - t + 1;
					}
				}
			}
			if (i != n)
			{
				for (j = 0; j < t; j++)
				{
				if (b[i][m - 1] == a[j])
				{
					for (p = j; p < t - 1; p++)
					{
						a[p] = a[p + 1];
					}
					t--;
				}
				}
			}
		}
		System.out.printf("%d\n", b[n - 1][0]);
		}

		}
		return 0;

	}

}

