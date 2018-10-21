package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[11][11][5];
	public static int Main()
	{
		  int x = new int(int i,int j,int k);
		  int i;
		  int j;
		  int m;
		  int n;
		  int q;
		  int p = 0;
		  for (i = 0;i < 11;i++)
		  {
			 for (j = 0;j < 11;j++)
			 {
				for (p = 0;p < 5;p++)
				{
				a[i][j][p] = 0;
				}
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
		  a[5][5][0] = m;
		  for (q = 0;q < n;q++)
		  {
				  for (i = 1;i < 10;i++)
				  {
					for (j = 1;j < 10;j++)
					{
					a[i][j][q + 1] = x(i, j, q);
					}
				  }
		  }
		  for (i = 1;i < 10;i++)
		  {
			 for (j = 1;j < 9;j++)
			 {
			 System.out.printf("%d ",a[i][j][n]);
			 }
			 System.out.printf("%d\n",a[i][9][n]);
		  }
	}
	public static int x(int i,int j,int k)
	{
		int b = 0;
		int l;
		for (l = -1;l < 2;l++)
		{
		b = b + a[i + l][j][k] + a[i + l][j - 1][k] + a[i + l][j + 1][k];
		}
		return (b + a[i][j][k]);
	}
}

