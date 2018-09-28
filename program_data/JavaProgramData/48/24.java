package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
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
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		a[4][4] = m;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (a[j][k] == 0)
					{
						continue;
					}
					else
					{
						t = a[j][k];
						b[j][k] += 2 * t;
						b[j - 1][k - 1] += t;
						b[j - 1][k] += t;
						b[j - 1][k + 1] += t;
						b[j][k - 1] += t;
						b[j][k + 1] += t;
						b[j + 1][k - 1] += t;
						b[j + 1][k] += t;
						b[j + 1][k + 1] += t;
					}
				}
			}
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					a[j][k] = b[j][k];
					b[j][k] = 0;
				}
			}

		}
		for (j = 0;j < 9;j++)
		{
				for (k = 0;k < 8;k++)
				{
					System.out.printf("%d ",a[j][k]);
				}
				System.out.printf("%d\n",a[j][8]);
		}
		return 0;
	}



}

