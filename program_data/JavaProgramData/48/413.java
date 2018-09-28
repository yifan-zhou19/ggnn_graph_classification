package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[10][10];
		  int[][] b = new int[10][10];
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
		  for (int j = 1;j <= 9;j++)
		  {
						  for (int k = 1;k <= 9;k++)
						  {
								  a[j][k] = 0;
								  b[j][k] = 0;
						  }
		  }
		  a[5][5] = m;
		  b[5][5] = m;
		  for (int i = 1;i <= n;i++)
		  {
				  for (int j = 2;j <= 8;j++)
				  {
						  for (int k = 2;k <= 8;k++)
						  {
								  b[j + 1][k + 1] = b[j + 1][k + 1] + a[j][k];
								  b[j][k + 1] = b[j][k + 1] + a[j][k];
								  b[j + 1][k] = b[j + 1][k] + a[j][k];
								  b[j][k] = b[j][k] + a[j][k];
								  b[j - 1][k + 1] = b[j - 1][k + 1] + a[j][k];
								  b[j - 1][k] = b[j - 1][k] + a[j][k];
								  b[j + 1][k - 1] = b[j + 1][k - 1] + a[j][k];
								  b[j][k - 1] = b[j][k - 1] + a[j][k];
								  b[j - 1][k - 1] = b[j - 1][k - 1] + a[j][k];
						  }
				  }
				  for (int j = 1;j <= 9;j++)
				  {
						  for (int k = 1;k <= 9;k++)
						  {
								  a[j][k] = b[j][k];
						  }
				  }
		  }
		  for (int j = 1;j <= 9;j++)
		  {
						  for (int k = 1;k <= 8;k++)
						  {
								  System.out.printf("%d ",a[j][k]);
						  }
						  System.out.printf("%d\n",a[j][9]);
		  }
	}
}

