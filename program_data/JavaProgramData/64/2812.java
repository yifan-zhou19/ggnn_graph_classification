package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[10][3];
	 int m;
	 int i;
	 int j;
	 int n;
	 int[][] d = new int[45][6];
	 int w;
	 double[] b = new double[45];
	 double q;
		 m = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	  for (i = 0;i < n;i++)
	  {
	  for (j = 0;j < 3;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
	  }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
		  b[m] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
		   d[m][0] = a[i][0];
		   d[m][1] = a[i][1];
		   d[m][2] = a[i][2];
		   d[m][3] = a[j][0];
		   d[m][4] = a[j][1];
		   d[m][5] = a[j][2];
		  m++;
		}
	  }
	  for (i = 0;i < m;i++)
	  {
		 for (j = 0;j < m - i - 1;j++)
		 {
			 if (b[j] < b[j + 1])
			 {
			  q = b[j];
			  b[j] = b[j + 1];
			  b[j + 1] = q;
			  w = d[j][0];
			  d[j][0] = d[j + 1][0];
			  d[j + 1][0] = w;
				   w = d[j][1];
				   d[j][1] = d[j + 1][1];
				   d[j + 1][1] = w;
					  w = d[j][2];
					  d[j][2] = d[j + 1][2];
					  d[j + 1][2] = w;
	w = d[j][3];
			  d[j][3] = d[j + 1][3];
			  d[j + 1][3] = w;
	w = d[j][4];
			  d[j][4] = d[j + 1][4];
			  d[j + 1][4] = w;
	w = d[j][5];
			  d[j][5] = d[j + 1][5];
			  d[j + 1][5] = w;
			 }
		 }
	  }
	  for (i = 0;i < m;i++)
	  {
		 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",d[i][0],d[i][1],d[i][2],d[i][3],d[i][4],d[i][5],b[i]);
	  }
	return 0;
	}
}

