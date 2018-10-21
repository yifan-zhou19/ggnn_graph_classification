package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int[][] a = new int[5][5];
	  int max;
	  int t;
	  int q = 0;
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
		 t = 0;
		 max = a[i][0];
		 n = 0;
		 for (j = 1;j < 5;j++)
		 {
		  if (a[i][j] > max)
		  {
			  max = a[i][j];
			  n = j;
		  }
		 }
		 for (j = 0;j < 5;j++)
		 {
		  if (max > a[j][n])
		  {
			  t++;
		  }
		 }
		 if (t == 0)
		 {
			 System.out.printf("%d %d %d",i + 1,n + 1,a[i][n]);
			 q++;
		 }
	  }
	  if (q == 0)
	  {
		  System.out.print("not found");
	  }
		return 0;
	}
}

