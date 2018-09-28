package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int n;
	public static int Main()
	{
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
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (a[j][k] > 0)
					{
						b[j - 1][k - 1] += a[j][k];
						b[j - 1][k] += a[j][k];
						b[j - 1][k + 1] += a[j][k];
						b[j][k - 1] += a[j][k];
						b[j][k + 1] += a[j][k];
						b[j + 1][k - 1] += a[j][k];
						b[j + 1][k] += a[j][k];
						b[j + 1][k + 1] += a[j][k];
						b[j][k] += 2 * a[j][k];
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

