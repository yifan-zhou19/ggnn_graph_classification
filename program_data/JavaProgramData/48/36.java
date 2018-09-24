package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[12][12];
		int[][] b = new int[12][12];
		int i;
		int j;
		int k;
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
		for (j = 0;j <= 10;j++)
		{
				for (k = 0;k <= 10;k++)
				{
					b[j][k] = 0;
					a[j][k] = 0;
				}
		}
		b[5][5] = m;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[j][k] += 2 * b[j][k] + b[j - 1][k] + b[j][k - 1] + b[j + 1][k] + b[j][k + 1] + b[j - 1][k - 1] + b[j + 1][k + 1] + b[j + 1][k - 1] + b[j - 1][k + 1];
				}
			}
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					b[j][k] = a[j][k];
					a[j][k] = 0;
				}
			}
		}
		for (j = 1;j <= 9;j++)
		{
				for (k = 1;k <= 9;k++)
				{
					a[j][k] += 2 * b[j][k] + b[j - 1][k] + b[j][k - 1] + b[j + 1][k] + b[j][k + 1] + b[j - 1][k - 1] + b[j + 1][k + 1] + b[j + 1][k - 1] + b[j - 1][k + 1];
				}
		}
		for (j = 1;j <= 9;j++)
		{
			for (k = 1;k < 9;k++)
			{
				System.out.printf("%d ",a[j][k]);
			}
			System.out.printf("%d\n",a[j][9]);
		}
		return 0;

	}
}

