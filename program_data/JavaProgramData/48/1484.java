package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int m;
		  int n;
		  int d;
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
		  int[][][] a = new int[11][11][6];
		  for (d = 0;d <= n;d++)
		  {
		  for (i = 0;i < 11;i++)
		  {
		  for (j = 0;j < 11;j++)
		  {
						   a[i][j][d] = 0;
		  }
		  }
		  }
		  a[5][5][0] = m;
		  for (d = 1;d <= n;d++)
		  {
						   for (i = 1;i <= 9;i++)
						   {
						   for (j = 1;j <= 9;j++)
						   {
						   a[i][j][d] = 2 * a[i][j][d - 1] + a[i - 1][j - 1][d - 1] + a[i - 1][j][d - 1] + a[i - 1][j + 1][d - 1] + a[i][j - 1][d - 1] + a[i][j + 1][d - 1] + a[i + 1][j - 1][d - 1] + a[i + 1][j][d - 1] + a[i + 1][j + 1][d - 1];
						   }
						   }
		  }
		  for (i = 1;i <= 9;i++)
		  {
		  for (j = 1;j < 9;j++)
		  {
		  System.out.printf("%d ",a[i][j][n]);
		  }
		  System.out.printf("%d\n",a[i][9][n]);
		  }
		  System.in.read();
		  System.in.read();
	}
}

