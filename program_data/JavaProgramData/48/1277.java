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
		  for (i = 0;i < 11;i++)
		  {
		  for (j = 0;j < 11;j++)
		  {
			a[i][j] = b[i][j] = 0;
		  }
		  }
		  a[5][5] = b[5][5] = m;
		  for (k = 0;k < n;k++)
		  {
						  for (i = 1;i <= 9;i++)
						  {
						  for (j = 1;j <= 9;j++)
						  {
										  b[i][j] = 2 * a[i][j] + a[i - 1][j] + a[i + 1][j] + a[i - 1][j - 1] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1];
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
		 for (j = 1;j <= 9;j++)
		 {
						  if (j == 9)
						  {
								  System.out.printf("%d\n",a[i][j]);
						  }
						  else
						  {
							  System.out.printf("%d ",a[i][j]);
						  }
		 }
		 }
		 System.in.read();
		 System.in.read();
	}

}

