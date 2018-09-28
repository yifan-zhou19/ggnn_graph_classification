package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int n;
		int i;
		int j;
		int x;
		int[][] b = new int[11][11];
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				b[i][j] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[5][5] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = 1;x <= n;x++)
		{
			for (i = 1;i <= 9;i++)
			{
				 for (j = 1;j <= 9;j++)
				 {
					 b[i][j] = a[i][j] * 2 + a[i + 1][j + 1] + a[i + 1][j] + a[i + 1][j - 1] + a[i][j + 1] + a[i][j - 1] + a[i - 1][j + 1] + a[i - 1][j] + a[i - 1][j - 1];
				 }
			}
			 for (i = 1;i <= 9;i++)
			 {
				 for (j = 1;j <= 9;j++)
				 {
					 a[i][j] = b[i][j];
				 }
			 }
		}
		for (i = 1;i <= 9;i++)
		{
						 System.out.printf("%d",b[i][1]);
						 for (j = 2;j <= 9;j++)
						 {
							 System.out.printf(" %d",b[i][j]);
						 }
						 System.out.print("\n");
		}
		return 0;
	}

}

