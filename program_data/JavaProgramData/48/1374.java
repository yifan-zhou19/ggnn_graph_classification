package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[11][11];
		int m;
		int n;
		int i;
		int j;
		int t;
		int[][] b = new int[11][11];
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
			 a[i][j] = 0;
			 b[i][j] = 0;
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
		a[5][5] = m;
		for (t = 0;t < n;t++)
		{
			for (i = 1;i < 10;i++)
			{
			for (j = 1;j < 10;j++)
			{
			b[i][j] = a[i][j] + (a[i][j - 1] + a[i][j + 1] + a[i - 1][j - 1] + a[i - 1][j] + a[i + 1][j + 1] + a[i + 1][j] + a[i + 1][j - 1] + a[i - 1][j + 1]);
			}
			}
			for (i = 1;i < 10;i++)
			{
			for (j = 1;j < 10;j++)
			{
				a[i][j] += b[i][j];
			}
			}
		}

		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
			 System.out.printf("%d ",a[i][j]);
			}

			 System.out.printf("%d\n",a[i][j]);
		}
	}
}

