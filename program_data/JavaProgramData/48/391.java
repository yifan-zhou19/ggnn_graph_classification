package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int m;
		int n;
		int x;
		int i;
		int r;
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
		for (x = 0;x < n;x++)
		{
		for (i = 1;i < 10;i++)
		{
						 for (r = 1;r < 10;r++)
						 {
										  a[i][r] = 2 * b[i][r] + b[i - 1][r - 1] + b[i - 1][r] + b[i - 1][r + 1] + b[i][r - 1] + b[i][r + 1] + b[i + 1][r - 1] + b[i + 1][r] + b[i + 1][r + 1];
						 }
		}
		for (i = 1;i < 10;i++)
		{
						  for (r = 1;r < 10;r++)
						  {
											b[i][r] = a[i][r];
						  }
		}
		}
		for (i = 1;i < 10;i++)
		{
						  for (r = 1;r < 9;r++)
						  {
											System.out.printf("%d ",a[i][r]);
						  }
						  System.out.printf("%d\n",a[i][r]);
		}
		return 0;
	}
}

