package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
	int[][] a = new int[10][10];
	int[][] b = new int[10][10];
		for (j = 1;j <= 9;j++)
		{
		   for (k = 1;k <= 9;k++)
		   {
			  a[k][j] = b[k][j] = 0;
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
	m = a[5][5];
	b[5][5] = m;
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= 9;j++)
		{
		   for (k = 1;k <= 9;k++)
		   {
			  if (a[k][j] != 0)
			  {
				   m = a[k][j];
				   b[k][j] = b[k][j] + m;
				   b[k + 1][j] = b[k + 1][j] + m;
				   b[k - 1][j] = b[k - 1][j] + m;
				   b[k][j + 1] = b[k][j + 1] + m;
				   b[k][j - 1] = b[k][j - 1] + m;
				   b[k + 1][j + 1] = b[k + 1][j + 1] + m;
				   b[k + 1][j - 1] = b[k + 1][j - 1] + m;
				   b[k - 1][j - 1] = b[k - 1][j - 1] + m;
				   b[k - 1][j + 1] = b[k - 1][j + 1] + m;
			  }
		   }
		}
		for (j = 1;j <= 9;j++)
		{
		   for (k = 1;k <= 9;k++)
		   {
			  a[k][j] = b[k][j];
		   }
		}
	}
		for (j = 1;j <= 9;j++)
		{
			for (k = 1;k <= 8;k++)
			{
				System.out.printf("%d ",a[k][j]);
			}
			System.out.printf("%d\n",a[9][j]);
		}
	}
}

