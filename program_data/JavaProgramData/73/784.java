package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[6][6];
	 int i;
	 int j;
	 for (i = 1;i <= 5;i++)
	 {
		 for (j = 1;j <= 5;j++)
		 {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar);
			   }
		 }
	 }
	 int l = 0;
	 for (i = 1;i <= 5;i++)
	 {
		   int s = 1;
		   int t;
		   int f = 0;
		   int m = a[i][1];
		   for (j = 1;j <= 5;j++)
		   {
			  if (a[i][j] > m)
			  {
				  m = a[i][j];
				  s = j;
			  }
		   }
		   for (t = 1;t <= 5;t++)
		   {
			  if (a[t][s] < m)
			  {
				  f = 1;
				  break;
			  }
		   }
		   if (f == 1)
		   {
			   continue;
		   }
		   System.out.printf("%d %d %d",i,s,a[i][s]);
		   l = l + 1;
	 }
	 if (l == 0)
	 {
		 System.out.print("not found");
	 }
	  return 0;

	}
}

