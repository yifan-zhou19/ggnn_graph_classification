package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		a[5][5] = m;
		b[5][5] = m;
		while (n > 0)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[i][j] != 0)
					{
						 b[i][j] = b[i][j] + a[i][j];
						 b[i - 1][j] += a[i][j];
						 b[i - 1][j - 1] += a[i][j];
						 b[i - 1][j + 1] += a[i][j];
						 b[i][j - 1] += a[i][j];
						 b[i][j + 1] += a[i][j];
						 b[i + 1][j] += a[i][j];
						 b[i + 1][j - 1] += a[i][j];
						 b[i + 1][j + 1] += a[i][j];
					}
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					 a[i][j] = b[i][j];
				}
			}
		 n--;
		}
		 for (i = 1;i <= 9;i++)
		 {
			 for (j = 1;j <= 9;j++)
			 {
				 if (j != 9)
				 {
					 System.out.printf("%d ",a[i][j]);
				 }
				 else
				 {
					 System.out.printf("%d\n",a[i][j]);
				 }
			 }
		 }
	return 0;
	}

}

