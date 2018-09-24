package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] sz1 = new int[10][3];
	  int n;
	  int i = 0;
	  int m;
	  double[] d = new double[100];
	  double e;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  m = n * (n - 1) / 2;
	  for (int row = 0; row < n; row++)
	  {
		  for (int col = 0; col < 3; col++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz1[row][col] = Integer.parseInt(tempVar2);
			   }
		  }
	  }
		for (int row1 = 0; row1 < n; row1++)
		{
			 for (int row2 = row1 + 1; row2 < n; row2++)
			 {
				 d[i] = Math.sqrt((Math.pow(sz1[row1][0] - sz1[row2][0],2) + Math.pow(sz1[row1][1] - sz1[row2][1],2) + Math.pow(sz1[row1][2] - sz1[row2][2],2)) * 1.0);
				 i = i + 1;
			 }
		}
	   for (int k = 1;k <= m;k++)
	   {
			for (i = 0;i < m - k;i++)
			{
			  if (d[i] > d[i + 1])
			  {
				e = d[i + 1];
				d[i + 1] = d[i];
				d[i] = e;
			  }
			}
	   }
		d[m] = 0;
		for (i = m - 1;i >= 0;i--)
		{
		   for (int row1 = 0; row1 < n; row1++)
		   {
			 for (int row2 = row1 + 1; row2 < n; row2++)
			 {
				 if (d[i] != d[i + 1])
				 {
				 if (Math.sqrt((Math.pow(sz1[row1][0] - sz1[row2][0],2) + Math.pow(sz1[row1][1] - sz1[row2][1],2) + Math.pow(sz1[row1][2] - sz1[row2][2],2)) * 1.0) == d[i])
				 {
				   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sz1[row1][0],sz1[row1][1],sz1[row1][2],sz1[row2][0],sz1[row2][1],sz1[row2][2],d[i]);
				 }
				 }
			 }
		   }
		}
	   return 0;
	}



}

