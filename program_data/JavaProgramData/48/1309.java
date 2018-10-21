package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[9][9];
		int m;
		int n;
		int p;
		int q;
		int u;
		int[][] t = new int[9][9];
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		for (u = 0; u < n; u++)
		{
			for (i = 4 - u; i <= 4 + u; i++)
			{
				for (j = 4 - u; j <= 4 + u; j++)
				{
					t[i][j] = a[i][j];
				}
			}
			for (i = 4 - u; i <= 4 + u; i++)
			{
				for (j = 4 - u; j <= 4 + u; j++)
				{
					for (p = i - 1; p <= i + 1; p++)
					{
							for (q = j - 1;q <= j + 1; q++)
							{
								a[p][q] = a[p][q] + t[i][j];
							}
					}
				}
			}




		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 8; j++)
			{
				System.out.printf("%d ", a[i][j]);
			}
			if (j = 8)
			{
				System.out.printf("%d\n", a[i][j]);
			}
		}

		return 0;
	}

}

