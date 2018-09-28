package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		int[][][] a = new int[5][9][9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0][4][4] = m;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (a[i - 1][j][k] != 0)
					{
						a[i][j][k] += a[i - 1][j][k];
						for (p = j - 1;p <= j + 1;p++)
						{
							for (q = k - 1;q <= k + 1;q++)
							{
								a[i][p][q] = a[i][p][q] + a[i - 1][j][k];
							}
						}
					}
				}
			}


		}

		for (j = 0;j < 9;j++)
		{
			System.out.printf("%d",a[n][j][0]);
			for (k = 1;k < 9;k++)
			{
				System.out.printf(" %d",a[n][j][k]);
			}
			System.out.print("\n");
		}
	}
}

