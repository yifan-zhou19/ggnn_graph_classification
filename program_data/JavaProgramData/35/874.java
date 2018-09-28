package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int maxi;
		int t;
		int rowmax = new int(int a[8][8], int m, int n, int r);
		int colmin = new int(int a[8][8], int m, int n, int c);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		t = 0;
		for (i = 0; i < m; i++)
		{
			maxi = rowmax(a, m, n, i);
			if (i == colmin(a, m, n, maxi))
			{
				System.out.printf("%d+%d", i, maxi);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}

	}

	public static int rowmax(int[][] a, int m, int n, int r)
	{
		int z;
		int j;
		z = 0;
		for (j = 0; j < n; j++)
		{
			if (a[r][z] < a[r][j])
			{
				z = j;
			}
		}
		return (z);
	}

	public static int colmin(int[][] a, int m, int n, int c)
	{
		int z;
		int i;
		z = 0;
		for (i = 0; i < m; i++)
		{
			if (a[z][c] > a[i][c])
			{
				z = i;
			}
		}
		return (z);
	}
}

