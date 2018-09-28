package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] a = new int[9][9];
		a[4][4] = m;
		int k;
		int i;
		int j;
		int[][] b = new int[9][9];
		for (k = 0;k < n;k++)
		{
		for (i = 1;i < 8;i++)
		{
		for (j = 1;j < 8;j++)
		{
			b[i][j] += a[i][j] * 2;
			b[i - 1][j - 1] += a[i][j];
			b[i - 1][j] += a[i][j];
			b[i - 1][j + 1] += a[i][j];
			b[i][j - 1] += a[i][j];
			b[i][j + 1] += a[i][j];
			b[i + 1][j - 1] += a[i][j];
			b[i + 1][j] += a[i][j];
			b[i + 1][j + 1] += a[i][j];
		}
		}
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
		a[i][j] = b[i][j];
		b[i][j] = 0;
		}
		}
		}
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
			System.out.printf("%d",a[i][j]);
			if (j != 8)
			{
			System.out.print(" ");
			}
		}
		if (i < 8)
		{
		System.out.print("\n");
		}
		}
	}

}

