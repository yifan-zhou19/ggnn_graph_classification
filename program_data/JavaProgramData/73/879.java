package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m = 0;
		  int n = 0;
		  int t = 0;
		  int p;
		  int[][] a = new int[5][5];
		  for (i = 0;i < 5;i++)
		  {
			  for (j = 0;j < 5;j++)
			  {
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar);
				   }
			  }
		  }
		  for (i = 0;i < 5;i++)
		  {
			  p = a[i][0];
			  m = i;
			  for (j = 0;j < 5;j++)
			  {
				   if (p < a[i][j])
				   {
						 n = j;
						 p = a[i][j];
				   }
			  }
			  if ((a[m][n] <= a[0][n]) && (a[m][n] <= a[1][n]) && (a[m][n] <= a[2][n]) && (a[m][n] <= a[3][n]) && (a[m][n] <= a[4][n]))
			  {
				   System.out.printf("%d %d %d",m + 1,n + 1,p);
				   t++;
			  }
			  n = 0;
		  }
		  if (t == 0)
		  {
		  System.out.print("not found");
		  }

	}

}

