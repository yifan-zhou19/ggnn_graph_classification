package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[20][20];
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
	for (i = 0;i <= m - 1;i++)
	{
	for (j = 0;j <= n - 1;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}

	for (i = 0;i <= m - 1;i++)
	{
					   for (j = 0;j <= n - 1;j++)
					   {
										  if (i == 0 && j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }
										  if (i == 0 && j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
										  {
											 System.out.printf("%d %d\n",i,j);
											 continue;
										  }
										  if (i == m - 1 && j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }
										  if (i == m - 1 && j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }

										  if (i == 0 && j != n - 1 && j != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }
										 if (i == m - 1 && j != n - 1 && j != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
										 {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										 }
										  if (i != 0 && i != m - 1 && j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }
										  if (i != 0 && i != m - 1 && j == n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
										  {
											  System.out.printf("%d %d\n",i,j);
											  continue;
										  }

										  if (i < m - 1 && j < n - 1 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
										  {
											   System.out.printf("%d %d\n",i,j);
											   continue;
										  }
					   }
	}


	   return 0;
	}

}

