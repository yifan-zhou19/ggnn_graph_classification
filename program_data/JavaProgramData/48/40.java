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
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
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
		b[5][5] = m;
		a[5][5] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 5 - i;j <= 5 + i;j++)
			{
				for (k = 5 - i;k <= 5 + i;k++)
				{

					a[j - 1][k - 1] += b[j][k];
					a[j - 1][k] += b[j][k];
					a[j - 1][k + 1] += b[j][k];
					a[j][k - 1] += b[j][k];
					a[j][k + 1] += b[j][k];
					a[j + 1][k - 1] += b[j][k];
					a[j + 1][k] += b[j][k];
					a[j + 1][k + 1] += b[j][k];
					a[j][k] += b[j][k];
				}
			}
			for (j = 5 - i;j <= 5 + i;j++)
			{
				for (k = 5 - i;k <= 5 + i;k++)
				{

					b[j - 1][k - 1] = a[j - 1][k - 1];
					b[j - 1][k] = a[j - 1][k];
					b[j - 1][k + 1] = a[j - 1][k + 1];
					b[j][k - 1] = a[j][k - 1];
					b[j][k + 1] = a[j][k + 1];
					b[j + 1][k - 1] = a[j + 1][k - 1];
					b[j + 1][k] = a[j + 1][k];
					b[j + 1][k + 1] = a[j + 1][k + 1];
					b[j][k] = a[j][k];
				}
			}
		}
		for (j = 1;j < 10;j++)
		{
			for (k = 1;k < 10;k++)
			{
				if (k != 9)
				{
					System.out.printf("%d ", a[j][k]);
				}
				else
				{
					System.out.printf("%d\n", a[j][k]);
				}
			}
		}
		return 0;
	}

}

