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
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		for (m = 0;m < 11;m++)
		{
			for (n = 0;n < 11;n++)
			{
				a[m][n] = 0;
				b[m][n] = 0;
			}
		}
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
		a[5][5] = m;
		b[5][5] = m;
		for (i = 0;i < n;i++)
		{
			for (k = 1;k < 10;k++)
			{
				for (j = 1;j < 10;j++)
				{
					b[k][j] = 2 * a[k][j] + a[k - 1][j - 1] + a[k - 1][j] + a[k - 1][j + 1] + a[k][j - 1] + a[k][j + 1] + a[k + 1][j - 1] + a[k + 1][j] + a[k + 1][j + 1];
				}
			}
			for (k = 0;k < 11;k++)
			{
				for (j = 0;j < 11;j++)
				{
					a[k][j] = b[k][j];
				}
			}
		}
		for (k = 1;k < 10;k++)
		{
			System.out.printf("%d",a[k][1]);
			for (j = 2;j < 10;j++)
			{
				System.out.printf(" %d",a[k][j]);
			}
			if (k < 9)
			{
				System.out.print("\n");
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

