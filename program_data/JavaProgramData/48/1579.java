package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];

	public static int grow(int i,int j)
	{
		 int p;
		 p = a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + 2 * a[i][j] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
		 return p;
	}
	public static int Main()
	{
		  int n;
		  int m;
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

		  for (i = 0;i < 11;i++)
		  {
		   for (j = 0;j < 11;j++)
		   {
			   a[i][j] = 0;
			b[i][j] = 0;
		   }
		  }
		   a[5][5] = m;
		   b[5][5] = m;
		   for (k = 1;k <= n;k++)
		   {
			 for (i = 1;i <= 9;i++)
			 {
			  for (j = 1;j <= 9;j++)
			  {
			  b[i][j] = grow(i, j);
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
			   System.out.printf("%d\n",b[i][j]);
				 }
			   else
			   {
			   System.out.printf("%d ",b[i][j]);
			   }
			  }
		  }

	}



}

